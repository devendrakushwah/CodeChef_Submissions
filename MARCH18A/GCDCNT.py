def gcd(a,b):
    big = a
    small = b
    if (a < b):
        big = b
        small = a
    r = big % small
    if (r == 0):
        return small
    else:
        return gcd(small, r)

n=int(raw_input())
ar=map(int,raw_input().split())
q=int(raw_input())
while(q>0):
    q-=1
    qr=map(int,raw_input().split())
    if(qr[0]==1):
        x,y=qr[1],qr[2]
        ar[x-1]=y
    else:
        l,r,g=qr[1],qr[2],qr[3]
        c=0
        for i in range(l-1,r):
            if(gcd(g,ar[i]))==1:
                c+=1
        print c
        
