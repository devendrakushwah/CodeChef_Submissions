for _ in range(int(raw_input())):
    n=int(raw_input())
    ar=map(int,raw_input().split())
    b=[]
    for i in range(n):
            #x=i*n+j
            b.append(ar[i]+ar[i])
    xor=0
    #print b, len(b)
    for i in range(n):
        xor=b[i]^xor
    print xor
