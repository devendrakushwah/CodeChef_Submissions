#include <bits/stdc++.h>
using namespace std;
int main()
{
    int t;
    string m,s;
    cin>>t>>m;
    map<char,char>map1;
    char x='a';
    for(int i=0;i<m.size();i++)
    {
        map1.insert(pair <char,char> (x,m[i]));
        x++;
    }
    map1.insert(pair <char,char> ('_',' '));
    while(t--)
    {
        cin>>s;
        char ch;
        for(int i=0;i<s.size();i++)
        {
            ch=s[i];
            if(ch=='.'||ch==','||ch=='?'||ch=='!')
            {
                cout<<ch;
            }
            else
            {
                if((int)ch<97 && ch!='_')
                {
                    ch=(int)ch+32;
                    char ch1=map1[ch];
                    cout<<(char)((int)ch1-32);
                }
                else
                {
                    cout<<map1[ch];
                }

            }

        }
        cout<<"\n";
    }
    return 0;
}
