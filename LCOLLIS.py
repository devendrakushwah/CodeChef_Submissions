t=int(raw_input())
while(t>0):
    t+=-1
    n,m=map(int,raw_input().split())
    ar=['' for i in range(n)]
    for i in range(n):
        ar[i]=raw_input()
    ans=0
    for i in range(m):
        b=0
        for j in range(n):
            if(ar[j][i] == '1'):
                b+=1
        ans += b*(b-1)//2
    print ans
