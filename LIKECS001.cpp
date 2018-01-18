#include <iostream>
#include <bits/stdc++.h>
#define ll long long
using namespace std;
 
int main() {
	int t;
	cin>>t;
	while(t--)
	{
		string s;
		cin>>s;
		int i,j,k,n;
		int flag=0;
		for(i=0;i<s.length();i++)
		{
			for(j=i+1;j<s.length();j++)
			{
				if(s[i]==s[j])
				{
					flag=1;
					break;
				}
			}
		}
		if(flag==0)
			cout<<"no\n";
		else 
			cout<<"yes\n";
	}
	return 0;
}  
