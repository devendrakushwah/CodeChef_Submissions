#include<bits/stdc++.h>
using namespace std;
int main()
{
    int n,h;
    bool hold=false;
    int cur=0;
    cin>>n>>h;
    int stk[n];
    int query[100000];
    for(int i=0;i<n;i++)
    {
        cin>>stk[i];
    }
    int q;

    for(int i=0;i<100000;i++)
    {
        cin>>q;
        if(q==0)
        {
            break;
        }
        query[i]=q;
    }
    int i=0;
    while(query[i]!=0)
    {
        if(query[i]==1)
        {
            if(cur!= 0)
            {
                cur--;
            }
        }

        if(query[i]==2)
        {
            if(cur != n-1)
            {
                cur++;
            }
        }

        if(query[i]==3)
        {
            if(!hold && stk[cur]>0)
            {
                hold=true;
                stk[cur]--;
            }
        }
        if(query[i]==4)
        {
            if(hold && stk[cur]<h)
            {
                hold=false;
                stk[cur]++;
            }
        }
//        cout<<"Operation"<<query[i]<<endl;
        i++;
    }
    for(int j=0;j<n;j++)
    {
        cout<<stk[j]<<" ";
    }
}
