for _ in range(int(raw_input())):
    n=int(raw_input())
    ar=map(int,raw_input().split())
    a=[]
    b=[]
    ca,cb=0,0
    for i in range(0,n-1,2):
        a.append(ar[i])
    for j in range(1,n,2):
        b.append(ar[j])
    a.sort(reverse=True)
    b.sort(reverse=True)
    for k in range(0,n/2):
        if(a[k]>b[k]):
            ca+=1
        elif(a[k]<b[k]):
            cb+=1
    #print a,b
    
    if(ca>cb):
        print '1'
    elif(ca<cb):
        print '2'
    else:
        print 'draw'
    
