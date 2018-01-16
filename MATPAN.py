t=int(raw_input())
while(t>0):
    t+=-1
    cost=0
    price=map(int,raw_input.split())
    string=str(raw_input())
    for a in 'abcdefghijklmnopqrstuvwxyz':
        i=0
        if(a not in string):
            cost+=price[i]
            i+=1
    print cost
