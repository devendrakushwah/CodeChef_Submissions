t=int(raw_input())
while(t>0):
    user_input = raw_input().split()
    n = int(user_input[0])
    m = int(user_input[1])
    c = int(user_input[2])
    count=0
    for i in range(1,n+1,1):
        if(c%i==0 and c/i<=m):
            count+=1
    print count
    t+=-1
