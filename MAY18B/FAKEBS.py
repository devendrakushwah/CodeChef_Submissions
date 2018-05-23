from copy import copy
 
x1,x2,y1,y2=0,0,0,0 #global vars
 
def bs(ar,l,r,x_,x):
    global x1,x2,y1,y2
    while(l<=r):
        m=(l+r)/2
        if ar[m]==x:
            return m
        elif ar[m]<x:
            if x_ > m:
                x1+=1
                l=m+1
            else:
                y1+=1
                r=m-1
        else:
            if x_<m:
                x2+=1
                r=m-1
            else:
                y2+=1
                l=m+1
    return None
 
#main
for _ in range(int(raw_input())):
    n,q=map(int,raw_input().split())
    a=map(int,raw_input().split())
    a.insert(0,0)
    b=copy(a)
    d1,d2={},{}
    for i in range(1,n+1):
        d1[a[i]]=i
    b.sort()
    for i in range(1,n+1):
        d2[b[i]]=i-1
    while(q>0):
        q-=1
        x=int(raw_input())
        x_=d1[x]
        x1=0;x2=0;y1=0;y2=0
        bg=n-(d2[x])-1
        sm=d2[x]
        ans=bs(a,1,n,x_,x)
        if(ans == -1):
            print '-1'
        else:
            if(sm<(x1+y2) or bg<(x2+y1)):
                print '-1'
            else:
                print max(y1,y2)
    
