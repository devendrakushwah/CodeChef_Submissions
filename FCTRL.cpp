#include<bits/stdc++.h>
typedef long long int ll;
using namespace std;
int main()
{
    int t,i,div;
    ll n,z;
    cin>>t;
        while(t--)
        {
            z=0;
            cin>>n;
        div=5;
        while((n/div)>0)
        {
            z=z+(n/div);
            div=div*5;
        }
        cout<<z<<endl;
    }

}
