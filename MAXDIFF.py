t=int(raw_input())
while(t>0):
    s1=0
    s2=0
    l1=raw_input().split()
    n=int(l1[0])
    k=int(l1[1])
    arr=map(int,raw_input().split())
    arr.sort()
    if(n-k < k):
        k=n-k
    for i in arr[:k]:
        s1+=i
    for i in arr[k:]:
        s2+=i
    print abs(s1-s2)
    t+=-1
