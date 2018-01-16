#include <bits/stdc++.h>
using namespace std;
int main()
{
    int t;
    string s;
    cin>>t;
    while(t--)
    {
        int counta=0,countb=0,countd=0,flag=0;
        cin>>s;
        for(int i=0;i<s.size();i++)
        {
            if(s[i]=='.')
            {
                countd++;
            }
            if(s[i]=='A')
            {
                counta++;
                if(flag==1)
                {
                    counta+=countd;
                }
                countd=0;
                flag=1;
            }
            if(s[i]=='B')
            {
                countb++;
                if(flag==2)
                {
//                    cout<<countd;
                    countb+=countd;
                }
                countd=0;
                flag=2;
            }
        }

            cout<<counta<<" "<<countb<<endl;

    }
    return 0;
}
