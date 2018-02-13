import collections


def find_all_index(l,a):
    cnt=[]
    for i in range(0,len(l)):
        if(l[i]==a):
            cnt.append(i+1)
    return cnt


#------------------------------------

for _ in range(int(raw_input())):
    s=str(raw_input())
    freq = collections.Counter(s)
    o,e=[],[]
    odd=0
    left,mid,right='','',''
    for i in range(97,123):
        if(freq[chr(i)]%2 != 0):
            odd+=1
            o.append(find_all_index(s,chr(i)))
        elif(freq[chr(i)]%2== 0 and freq[chr(i)]!=0):
            e.append(find_all_index(s,chr(i)))
    #print e
    #print o
    if(odd>1):
        print '-1'
    else:
        if(odd==1):
            mid=''.join(str(x)+' ' for x in o[0])
        #print mid
        for i in range(len(e)):
            left=left+''.join(str(x)+' ' for x in(e[i][0:len(e[i])/2]))
            right=''.join(str(x)+' ' for x in (e[i][len(e[i])/2:len(e[i])]))+right
        print left+mid+right
        
        
