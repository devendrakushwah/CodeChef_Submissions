#include <bits/stdc++.h>
typedef long long ll;
using namespace std;
ll n,b;
ll func(ll x)
    {
        if(x > n)
        {
            return 0;
        }
        return x * (n - x * b);
    }

int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        cin>>n>>b;
        int sol=n/(2*b);
        cout<<max(func(sol) , func(sol+1))<<endl;
    }
}
