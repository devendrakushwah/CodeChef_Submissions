#include <bits/stdc++.h>
using namespace std;
long long bin_find(long long a[],long long l,long long r,long long num)
{
	long long mid;
	if(a[r]<num)
		return a[r];
	while(1)
	{
		mid=(l+r)/2;
		if(a[mid]<num && a[mid+1]>=num)
			return a[mid];
		else if(a[mid] <num && a[mid+1] < num)
		{
			l=mid+1;
		}
		else if(a[mid] >= num && a[mid+1] >= num)
		{
			r=mid-1;
		}
	}
}
int main() {
	long long t,sum,n,i,last,a[705][705],flag,j;
	cin >> t;
	while(t--)
	{
		flag=0;
		sum=0;
		cin >> n;
		for(i=1;i<=n;i++)
		{
			for(j=0;j<n;j++)
				cin >> a[i][j];
			sort(a[i],a[i]+n);
		}
		last=a[n][n-1];
		sum=last;
		for(i=n-1;i>0;i--)
		{
			if(a[i][0]>=last)
			{
				flag=1;
				break;
			}
			last=bin_find(a[i],0,n-1,last);
			sum+=last;
		}
		if(flag)
			cout << "-1\n";
		else
			cout << sum << endl;
	}
	return 0;
}
/*
devendra kushwah
input:
1
3
1 2 3
4 5 6
7 8 9
*/