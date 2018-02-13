for _ in range(int(raw_input())):
    n,m,x,k=map(int,raw_input().split())
    s=str(raw_input())
    # maximum of x workers can work in same month
    # k total no of workers
    #m is months 123...
    # n no. of patents
    # approach :- Find the max total work that can be done.
    o=[1,3,5,7,9,11]
    max_patent=0
    even=s.count('E')
    odd=s.count('O')

    for i in range(1,1+m):
        if(i in o):
            if(odd>=x):
                max_patent+=x
                odd=odd-x
            else:
                max_patent+=odd
                odd=0
        else:
            if(even>=x):
                max_patent+=x
                even=even-x
            else:
                max_patent+=even
                even=0
    if(max_patent>=n):
        print 'yes'
    else:
        print 'no'
        
'''
2
4 4 2 4
EEOO
4 3 1 4
EEOO
'''
