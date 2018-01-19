t=int(raw_input())
while(t>0):
    t+=-1
    n,x=map(int,raw_input().split())
    ar=map(int,raw_input().split())
    money=sum(ar)
    if(n==1):
        if((ar[0]%x)>=1):
            print ar[0]/x
        else:
            print "-1"
    else:
        if(money%x>1):
            print "-1"
        else:
            print money/x
