#include <bits/stdc++.h>
using namespace std;
int main()
{
    int t;
    long a,b,c,d;
    cin>>t;
    while(t--)
    {
        cin>>a>>b>>c>>d;
		if (((a==b)&&(c==d)) && ((a*a + c*c) == (b*b + d*d)))
        {
                cout<<"YES";
        }
		else if (((a==c)&&(b==d)) && ((a*a + b*b) == (c*c + d*d)))
        {
            cout<<"YES";
        }

		else if (((a==d)&&(b==c)) && ((a*a + b*b) == (b*b + d*d)))
        {
            cout<<"YES";
        }

		else
        {
            cout<<"NO";
        }
        cout<<"\n";

    }
}
/*
devendra kushwah
input
3
1 1 2 2
3 2 2 3
1 2 2 2
*/
