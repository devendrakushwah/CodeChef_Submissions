#include <bits/stdc++.h>
using namespace std;
const int MAX = 1000000;
int prefix[MAX + 1];
 
void buildPrefix()
{
    bool prime[MAX + 1];
    memset(prime, true, sizeof(prime));
 
    for (int p = 2; p * p <= MAX; p++) {
 
        if (prime[p] == true) {
 
            // Update all multiples of p
            for (int i = p * 2; i <= MAX; i += p)
                prime[i] = false;
        }
    }
    prefix[0] = prefix[1] = 0;
    for (int p = 2; p <= MAX; p++) {
        prefix[p] = prefix[p - 1];
        if (prime[p])
            prefix[p]++;
    }
}
int query(int L, int R)
{
    return prefix[R] - prefix[L - 1];
}
int main()
{
    buildPrefix();
    int t,L,R;
    scanf("%d",&t);
    while(t--)
    {
        scanf("%d%d",&L,&R);
        float ans=query(L,R);
        printf("%.6f\n",ans/(R-L+1));
    }
    return 0;
}
