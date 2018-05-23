b=[]
def bsearch(high,x):
    low=0
    while(low<=high):
        mid=(low+high)/2
        if(b[mid]>=x):
            high=mid-1
        else:
            if(mid!=high and b[mid+1]<x):
                low=mid+1
            else:
                return mid
    return -1
n,q=map(int,raw_input().split())
ar=map(int,raw_input().split())
while(q>0):
    q-=1
    qr=map(int,raw_input().split())
    if(qr[0]==1):
        x=qr[1]
        v=qr[2]
        ar[x-1]=v
    else:
        l=qr[1]
        r=qr[2]
        for i in range(l-1,r):
            b.append(ar[i])
        b.sort()
        flag=0
        i=len(b)-1
        rng=reversed(range(2,len(b)))
        for i in rng:
            pos=bsearch(i-2,b[i]+b[i-1])
            if(pos!= -1):
                if(b[pos]+b[i-1]>b[i]):
                    flag=1
                    break
            else:
                break
        if(flag==0):
            print '0'
            del b[:]
        else:
            print b[pos]+b[i-1]+b[i]
            del b[:]
