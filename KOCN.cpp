#include<bits/stdc++.h>
using namespace std;
typedef long long int lld;
int main() {
	
	int t;
	cin>>t;
	while(t--)
	{
		lld n,k,sumA=0,final_max;
		cin>>n>>k;
		lld arr[100000];
		for(lld i=0;i<n;i++)
		{
			cin>>arr[i];
		}
		if(k==1)
		{
			lld max_so_far = arr[0];
			lld curr_max = arr[0];
			for (lld i = 1; i < n; i++)
			{
				  curr_max = max(arr[i%n], curr_max+arr[i%n]);
				  max_so_far = max(max_so_far, curr_max);
			}
			cout<<max_so_far<<endl;	
		}
		else
		{
			for(lld i=0;i<n;i++)
			{
				sumA=sumA+arr[i];
			}
			if(sumA>0)
			{
				lld max_so_far = arr[0];
				lld curr_max = arr[0];
				for (lld i = 1; i < (n*2); i++)
				{
					  curr_max = max(arr[i%n], curr_max+arr[i%n]);
					  max_so_far = max(max_so_far, curr_max);
				}
				final_max=max_so_far+(k-2)*sumA;
				cout<<final_max<<endl;
			}
			else
			{
				lld max_so_far = arr[0];
				lld curr_max = arr[0];
				for (lld i = 1; i < (n*2); i++)
				{
					  curr_max = max(arr[i%n], curr_max+arr[i%n]);
					  max_so_far = max(max_so_far, curr_max);
				}
				cout<<max_so_far<<endl;
			}	
		}
		
	
	}
	return 0;
} 

/*
devendra kushwah
input:
3
2 3
1 2
3 2
1 -2 1
5 2
4 -8 -2 1 3
*/