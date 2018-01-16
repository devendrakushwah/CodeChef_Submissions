def command1(arr,l,r):
    for i in range(l,r,1):
        arr[i]+=1
def command2(arr,cmd,l,r):
    for i in range(l,r,1):
        if (cmd[i][0]==1):
            command1(ar,cmd[i][1],cmd[i][2])
        else:
            command2(ar,cmd,cmd[i][1],cmd[i][2])
#----main-------
tc=int(raw_input())
for t in range(0,tc,1):
    n=int(raw_input())
    m=int(raw_input())
    ar=list()
    for i in range(0,n,1):
        ar.append(0)
    cmd = [[0 for x in range(3)] for y in range(m)]
    for i in range(0,m,1):
        for j in range(0,3,1):
            cmd[i][j]=int(raw_input())
            l,r=cmd[i][1]-1,cmd[i][2]
            if(cmd[i][0]==1):
                command1(ar,l,r)
            else:
                command2(ar,cmd,l,r)
    for i in range(0,n,1):
        print ar[i]
            
                          
