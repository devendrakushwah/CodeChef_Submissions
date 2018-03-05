for _ in range(int(raw_input())):
    n=int(raw_input())
    box=n/7
    c=0
    s=0
    for i in range(box):
        c+=7
        s+=c
    print s 
