#include<bits/stdc++.h>
typedef long long int lld;
using namespace std;
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		lld r,n,s,e,w;
		cin>>r>>n>>s>>e>>w;
		if(r==n || r==s || r==e || r==w) 
		{
			cout<<"YES"<<endl;
		}
		else
		{
			cout<<"NO"<<endl;
		}
	}
} 
