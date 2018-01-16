t=int(raw_input())
while(t>0):
    arr=set()
    n=int(raw_input())
    l=raw_input().split()
    for i in range(0,n):
        arr.add(l[i])
    print len(arr)
    t+=-1
        
