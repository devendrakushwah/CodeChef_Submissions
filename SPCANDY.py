t=int(raw_input())
while(t>0):
    t+=-1
    l=raw_input()
    n=int(l.split()[0])
    k=int(l.split()[1])
    if(k==0):
        print '0 '+str(n)
    else:
        print str(n/k)+" "+str(n%k)
