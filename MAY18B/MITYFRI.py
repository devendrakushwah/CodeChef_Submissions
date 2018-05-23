for _ in range(int(raw_input())):
    n,k=map(int,raw_input().split())
    ar=map(int,raw_input().split())
    motu,tomu=[],[]
    for i in range(n):
        if(i%2==0):
            motu.append(ar[i])
        else:
            tomu.append(ar[i])
    motu.sort(reverse=True)
    tomu.sort()
    #print motu,tomu
    c=0
    length=len(tomu)
    i=0
    while(c<k and i<length):
        if(motu[i]>=tomu[i]):
            motu[i],tomu[i]=tomu[i],motu[i]
            i+=1
            c+=1
        else:
            break
    sum_tomu=sum(tomu)
    sum_motu=sum(motu)
    #print s1,s2
    if(sum_tomu>sum_motu):
        print 'YES'
    else:
        print 'NO'
