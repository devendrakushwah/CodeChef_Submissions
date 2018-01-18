#include <bits/stdc++.h>
using namespace std;
long long t,taken[1000000],n,k,sum,s,b;
bool fn(long long nn,long long li)
{
	if(s==sum/2)
	{
		return true;
 	return fn(n,nn-1);}
	for(int i=li;i>=1;i--)
	{
		if(taken[i]==1||i==k)
		continue;
 
		if(s+i<=sum/2)
				{
				taken[i]=1;
					s=s+i;
					bool nxt=fn(n,i-1);
					taken[i]=0;
					s=s-i;
					if(nxt){taken[i]=1;
					return true;}
				}
	}
	return false;	
	}
 
int main() {long long i=0;
	cin>>t;
	while(t--)
	{s=0;b=0;
		cin>>k>>n;
		sum=(n*(n+1))/2-k;
		if(sum%2!=0||n<4)
		{
			cout<<"impossible"<<endl;
		}
		else
		{
			b=fn(n,n);
			if(b){
			taken[k]=2;
			for(i=1;i<=n;i++)
			{
				cout<<taken[i];
				taken[i]=0;
			}
			cout<<endl;}
			else
			{
			cout<<"impossible"<<endl;	
			}}}
	return 0;
}