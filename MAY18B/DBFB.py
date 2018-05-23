MOD=1000000007
 
def fib_gen():
    fib=[0]*100000
    fib[0]=0
    fib[1]=1
    for i in range(2,100000):
        fib[i]=(fib[i-1]+fib[i-2])%MOD
    return fib
 
def solver(m,n,a,b,fib):
    ans=0
    if(n==1):
        for i in range(m):
            ans=ans+a[i]
            ans=ans%MOD
        ans=(m*ans)%MOD
        
    elif(n==2):
        for i in range(m):
            ans=ans+b[i]
            ans=ans%MOD
        ans=(m*ans)%MOD
        
    else:
        a1=m*(fib[n-2])
        a1%=MOD
        b1=m*(fib[n-1])
        b1%=MOD
        ans_a,ans_b=0,0
        for i in range(m):
            ans_a=(ans_a+a[i])%MOD
            ans_b=(ans_b+b[i])%MOD
        ans=((a1*ans_a)%MOD+(b1*ans_b)%MOD)%MOD
        
    return ans
 
for _ in range(int(raw_input())):
    m,n=map(int,raw_input().split())
    a=map(int,raw_input().split())
    b=map(int,raw_input().split())
    ans=solver(m,n,a,b,fib_gen())
    print ans
 
