#include<iostream>
using namespace std;
int main(){
int t;
cin>>t;
while(t--){
int n;
cin>>n;
if(n==1){
	cout<<1;
}else if(n&1==1){
	int s = (n-1)-(n/2);
	while(n--){
		cout<<s<<" ";
		s++;
	}
 
}else{
	int s=n/2;
	while(n--){
		cout<<s<<" ";
		s++;
	}
 
}
cout<<endl;
}
return 0;
} 
