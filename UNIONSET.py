t=int(raw_input())
while(t>0):
    cost=0
    t+=-1
    n,k=raw_input().split()
    n,k=int(n),int(k)
    arr=[]
    temp=[]
    while(n>0):
        arr2=map(int,raw_input().split())
        arr.append(arr2)
        n+=-1
    for ar in arr:
        ar=ar.pop(0)
    for i in range(len(arr)):
        for j in range(i+1,len(arr)):
            temp.append(set(arr[i]+arr[j]))
    for s in temp:
        if(len(s)==k):
            cost+=1
    print cost
