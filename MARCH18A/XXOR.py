#ar=[0]*1000005
#br=[0]*1000005
dp= [[0]*32]*1000005
n,q=map(int,raw_input().split())
ar=map(int,raw_input().split())
ar.insert(0,0)
for i in range(1,n+1):
    #ar[i]=int(raw_input())
    x=ar[i]
    for j in range(31):
        dp[i][j]=ar[i]%2
        ar[i]/=2
    ar[i]=x
#print dp    
for i in range(2,n+1):
    for j in range(31):
        dp[i][j]=dp[i][j]+dp[i-1][j]

t,y,l=0,0,0
while(q>0):
    q-=1
    x,y=map(int,raw_input().split())
    r=0
    z=1
    m=y-x+1
    for i in range(31):
        t=dp[y][i]-dp[x-1][i]
        l=m-t
        if t<l:
            r+=z
        z*=2
    print r,z
    
