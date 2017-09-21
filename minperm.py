t=int(raw_input())
while(t>0):
    n=int(raw_input())
    if(n%2==0):
        for i in range(2,n+1,2):
            print (str(i)+" "+str(i-1)+""),
        print "\n"
    else:
        for i in range(2,n-2,2):
            print (str(i)+" "+str(i-1)),
        print (str(n-1)+" "+str(n)+" "+str(n-2)+"\n")
    t-=1
