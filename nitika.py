t=int(raw_input())
while(t>0):
    t+=-1
    inp=raw_input()
    s=inp.split()
    if(len(s)==1):
        print(s[0].lower().capitalize())
    elif(len(s)==2):
        print(s[0].capitalize())[0]+'. '+s[1].lower().capitalize()
    elif(len(s)==3):
        print s[0].capitalize()[0]+'. '+s[1].capitalize()[0]+'. '+s[2].lower().capitalize()
    
