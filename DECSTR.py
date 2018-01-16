'''trash
def solve(ans,k):
    count=0
    i=0
    while(i+1<len(ans)):
        if(ord(ch[i])>ord(ch[i+1])):
            count+=1
    if(count==k):
        return True
    else:
        return False
'''
#devendra 13/12/17  
t=int(raw_input())
alpha="zyxwvutsrqponmlkjihgfedcba"
for i in range(0,t):
    k=int(input())
    ans=""
    while k!=0:
        if k>=25:
            ans=ans+alpha
            k-=25
        else:
            ans=alpha[25-k:]+ans
            k=0
    print(ans) 

