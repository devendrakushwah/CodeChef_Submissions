for _ in range(int(raw_input())):
    n=int(raw_input())
    team=map(str,raw_input().split())
    a,b=[],[]
    for _ in range(n):
        x,y=map(str,raw_input().split())
        a.append(x)
        b.append(int(y))
    first=b.index(max(b))
    b[first]=0
    second=b.index(max(b))
    if(a[first] in team and a[second] in team):
        print 'right'
    else:
        print 'wrong'
    
