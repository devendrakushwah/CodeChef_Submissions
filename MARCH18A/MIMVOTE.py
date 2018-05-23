for _ in range(int(raw_input())):
    n=int(raw_input())
    a=map(int,raw_input().split())
    b=[0]*n
    d=[0]*n
    s=0
    a1=[0]*n
    d=[0]*n
    for i in range(n):
        s=s+a[i]
        b[i]=s
        d[i]=0
    for i in range(n-1):
        low=i+1
        high=n-1
        mid=(low+high)/2
        while(low<high):
            mid=(low+high)/2
            if((b[mid]-a[mid]-b[i])<a[i]):
                if(low==mid and mid==high):
                    low=mid
                    break
                elif(low==mid):
                    mid=mid+1
                    if((b[mid]-a[mid]-b[i])>a[i]):
                        mid=mid-1
                        low=mid
                        break
                    else:
                        low=mid
                        break
                else:
                    low=mid
            elif((b[mid]-a[mid]-b[i])==a[i]):
                low=mid
                break
            elif((b[mid]-a1[mid]-b[i])>a1[i]):
                high=mid-1
        c=low
        for y in range(i+1,c+1):
            d[y]+=1

    #----------second----------
    s=0
    for i in reversed(range(0,n)):
        a1[n-1-i]=a[i]
        s+=a[i]
        b[n-1-i]=s
        a[i]=0
    for i in range(n-1):
        low=i+1
        high=n-1
        mid=(low+high)/2
        while(low<high):
            mid=(low+high)/2
            if((b[mid]-a1[mid]-b[i])<a1[i]):
                if(low==mid and mid==high):
                    low=mid
                    break
                elif(low==mid):
                    mid+=1
                    if((b[mid]-a1[mid]-b[i])>a1[i]):
                        mid-=1
                        low=mid
                        break
                    else:
                        low=mid
                        break
                else:
                    low=mid
            elif((b[mid]-a1[mid]-b[i])==a1[i]):
                low=mid
                break
            elif((b[mid]-a1[mid]-b[i])>a1[i]):
                high=mid-1
        c=low
        for j in range(i+1,c+1):
            a[j]+=1
    for k in range(n):
        d[k]=d[k]+a[n-1-k]
        print d[k],
    print ''
                
                
    
