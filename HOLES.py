t=int(raw_input())
dct={'A':1,'B':2,'D':1,'O':1,'P':1,'Q':1,'R':1}
while(t>0):
    holes=0
    t+=-1
    inp=str(raw_input())
    for s in inp:
        if s in dct:
            holes+=dct[s]
    print holes
    
