import math
def solve(n):
    mini=n
    for i in range(1,n/2):
        if(n%i==0):
            diff=abs(i-(n/i))
        if(diff<mini):
            mini=diff
    return mini
    
t=int(raw_input())
while(t>0):
    n=int(raw_input())
    if (math.sqrt(n)-int(math.sqrt(n))):
        print solve(n)
    else:
        print 0
    t+=-1
    
