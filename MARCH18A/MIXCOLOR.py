from collections import Counter as Cnt
for _ in range(int(raw_input())):
    n=int(raw_input())
    ar=map(int,raw_input().split())
    d=dict(Cnt(ar))
    #print d,len(d),d.values()
    print sum(d.values())-len(d)
    
