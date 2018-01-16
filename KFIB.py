ls=map(int,raw_input().split())
n=ls[0]
k=ls[1]
l=list()
for i in range(k):
    l.append(1)
for i in range(k,n):
    c=sum(l)
    l.append(c%1000000007)
    c=0
    l.pop(0)
    
print l[-1]
