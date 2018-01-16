s=str(raw_input())
q=int(raw_input())
while(q>0):
    q+=-1
    arr=map(int,raw_input().split())
    s2=s[0:arr[0]-1]+s[arr[0]-1:arr[1]][::-1]+s[arr[1]:]
    palin=s2[arr[2]-1:arr[3]]
    if(palin==palin[::-1]):
        print "Yes"
    else:
        print "No"

