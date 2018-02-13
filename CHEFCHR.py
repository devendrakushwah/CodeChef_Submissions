for _ in range(int(raw_input())):
    s=str(raw_input())
    ans=0
    for i in range(len(s)-3):
        sub_str=s[i:i+4]
        c=sub_str.count('c')
        h=sub_str.count('h')
        e=sub_str.count('e')
        f=sub_str.count('f')
        if(c==1 and h==1 and e==1 and f==1):
            ans+=1
    if(ans==0):
        print 'normal'
    else:
        print 'lovely '+str(ans)
