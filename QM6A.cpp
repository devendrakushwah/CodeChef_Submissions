#include<bits/stdc++.h>
typedef long long int lld;
using namespace std;
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		lld n,sum;
		cin>>n;
		sum=(n*(n+1)*(2*n+1))/6;
		sum=sum-(n*n);
		sum=(2*sum)+n*n;
		cout<<sum<<endl;
	}
} 
