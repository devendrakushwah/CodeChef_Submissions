#include<bits/stdc++.h>
using namespace std;
int main(){
int t,n,k;
cin>>t;
while(t--){int c=0;
cin>>n>>k;
vector <int> h(10000000,0);int a[n];
for(int i=0;i<n;i++){
 cin>>a[i];h[a[i]]++;}
for(int i=0;i<k;i++)
if(h[1<<i]==0)c++;
  cout<<c<<endl;
  }
  return 0;} 
