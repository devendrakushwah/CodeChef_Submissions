for i in range(int(raw_input())):
    front=True
    back=True
    n=int(raw_input())
    l=list(map(int,raw_input().split()))
    g=list(map(int,raw_input().split()))
    for i in range(n):
        if(l[i]>g[i]):
            front=False
            break
    for i in range(n):
        if(l[i]>g[n-1-i]):
            back=False
            break
    if(front and back):
        print 'both'
    elif(front==True and back==False):
        print 'front'
    elif(front==False and back==True):
        print 'back'
    else:
        print 'none'
            
