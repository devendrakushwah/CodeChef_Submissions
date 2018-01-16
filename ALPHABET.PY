import re
known=str(raw_input())
n=int(raw_input())
while(n>0):
    n+=-1
    string=str(raw_input())
    string=re.sub('['+known+']', '',string)
    if(len(string)!=0):
        print 'No'
    else:
        print 'Yes'
