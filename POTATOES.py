def prime(i):
    flag=True
    for num in range(2,i):
        if(i%num==0):
            flag=False
            break
    return flag
            
for t in range(int(raw_input())):
    x,y=map(int,raw_input().split())
    i=1
    while(1):
        if(prime(x+y+i)):
            print i
            break
        else:
            i+=1
    
