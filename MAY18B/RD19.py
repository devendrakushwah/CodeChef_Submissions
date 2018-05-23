from fractions import gcd
for i in range(int(raw_input())):
    n=int(raw_input())
    ar=map(int,raw_input().split())
    f=ar[0]
    for i in range(1,n):
        f=gcd(f,ar[i])
    if(f==1):
        print '0'
    else:
        print '-1'
