def circle(x1, y1, x2, y2, r1, r2):
    distSq = (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2); 
    radSumSq = (r1 + r2) * (r1 + r2); 
    if (distSq == radSumSq):
        return 1 
    elif (distSq > radSumSq):
        return -1 
    else:
        return 0 
 
for _ in range(int(raw_input())):
    x1,y1,r1=map(int,raw_input().split())
    x2,y2,r2=map(int,raw_input().split())
    t = circle(x1, y1, x2, y2, r1, r2) 
    if (t == 1):
        print "tangential" 
    elif (t < 0):
        print 'not overlapping' 
    else:
        print 'overlapping'
