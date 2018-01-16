#include <bits/stdc++.h>
int main()
{
    int t,n;
    scanf("%d",&t);
    while(t--)
    {
        scanf("%d",&n);
        while(n>0)
        {
            printf("x");
            n--;
            if(n==0)break;
            printf("y");
            n--;
            if(n==0)break;
            printf("z");
            n--;
            if(n==0)break;
        }
        printf("\n");
    }
    return 8;
}
