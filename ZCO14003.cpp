#include <bits/stdc++.h>
typedef long long int lld;
using namespace std;
int main()
{
    lld n,max=0;
    cin>>n;
    lld ar[n];
    for(int i=0;i<n;i++) cin>>ar[i];
    sort(ar,ar+n);  //sort

    for(int i=0;i<n;i++)
    {
        ar[i]=ar[i]*(n-i);
    }
    for (int i=0;i<n;i++)
    {
        if(max < ar[i]) max = ar[i];
    }
    cout<<max<<endl;
}
