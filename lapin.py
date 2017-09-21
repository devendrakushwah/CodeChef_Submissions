def ff(s,l,c):
    count=0
    for i in range(0,len(s),1):
        if(c==s[i]):
            count+=1
    return count
    
    
t=int(raw_input())
while(t>0):
    t-=1
    s=list(str(raw_input()))
    if((len(s)%2)!=0):
        s.pop(len(s)/2)
    l=len(s)
    s1=s[0:l/2]
    s2=s[(l/2):l]
    flag=0
    #print s1
    #print s2
    for i in range(0,len(s1),1):
        if(ff(s1,len(s1),s1[i])==ff(s2,len(s1),s1[i])):
            continue
        else:
            flag+=1
    if(flag!=0):
        print "NO"
    else:
        print "YES"
        
