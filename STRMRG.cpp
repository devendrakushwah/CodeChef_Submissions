#include <bits/stdc++.h>
using namespace std;
// Longest Common Subseqence GeeksforGeeks
int lcs( string X, string Y, int m, int n )
{
   int L[m+1][n+1];
   int i, j;
 
   /* Following steps build L[m+1][n+1] in bottom up fashion. Note 
      that L[i][j] contains length of LCS of X[0..i-1] and Y[0..j-1] */
   for (i=0; i<=m; i++)
   {
     for (j=0; j<=n; j++)
     {
       if (i == 0 || j == 0)
         L[i][j] = 0;
 
       else if (X[i-1] == Y[j-1])
         L[i][j] = L[i-1][j-1] + 1;
 
       else
         L[i][j] = max(L[i-1][j], L[i][j-1]);
     }
   }
 
   /* L[m][n] contains length of LCS for X[0..n-1] and Y[0..m-1] */
   return L[m][n];
}
int main() {
	// your code goes here
	int t,n,m,cl,cl1,len,i;
	string s1,s2,s3,s4;
	set<char> s;
	scanf("%d",&t);
	while(t--){
		scanf("%d %d",&n,&m);
		cl=1;cl1=1;
		cin>>s1>>s2;
		s3=s3+s1[0];
		for(i=1;i<s1.length();i++){
		   if(s1[i-1]!=s1[i]){
		        cl++;
		        s3+=s1[i];
		   }
		}
		s4=s4+s2[0];
		 // s.insert(s1[i]);
		//cl=s.size();
		//s.clear();
		for(i=1;i<s2.length();i++){
			if(s2[i-1]!=s2[i]){
			  cl1++;
			  s4+=s2[i];
			}
		}
		//  s.insert(s2[i]);
		//cl1=s.size();
		//s.clear();
		len=lcs(s3,s4,cl,cl1);
	//	cout<<len<<" "<<cl<<" "<<cl1<<"\n";
	 //           cout<<s3<<" "<<s4<<"\n";
		printf("%d\n",abs((cl+cl1)-len));
		s1.clear();s2.clear();
		s3.clear();s4.clear();
	}
	return 0;
}
/*
devendrA kushwah
input:
1
4 4
abab
baba
*/