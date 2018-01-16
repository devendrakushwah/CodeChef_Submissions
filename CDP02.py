def solve(n):
    sum1=0
    while(n>0 or sum1>9):
        if(n==0):
            n=sum1
            sum1=0
        sum1+=n%10
        n/=10
    return sum1

a=(raw_input()).split()
n=str(a[0])
k=int(a[1])
num=int(n*k)
if(len(str(num))==1):
    print n
else :
    print solve(num)

