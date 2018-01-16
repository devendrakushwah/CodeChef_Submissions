#include <bits/stdc++.h>
using namespace std;
int main()
{
    int t,n;
    string str;
    cin>>t;
    map <char,int> chr;
    set <char> setc;
    while(t--)
    {
        int cost=0;
        for(int i=97;i<123;i++)
        {
            cin>>n;
            chr.insert(pair <char,int>((char)i,n));
        }
        cin>>str;
        for(int i=0;i<str.size();i++)
        {
            setc.insert(str[i]);
        }
        for(int i=97;i<123;i++)
        {
            if(setc.count((char)i)==0)
            {
                     cost+=chr[(char)i];
            }
        }
        cout<<cost<<endl;
    }
}
