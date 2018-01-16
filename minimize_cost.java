import java.util.*;
class minimize_cost
{
    static int min(int x,int y)
    {
        return Math.min(x, y);
    }

    static int solve(int cost[][],int n)
    {
        int sum=cost[0][0];
        int cp=cost[0][0];
        int len=n;
        for(int i=0;i+1<n;i++)
        {
            for(int j=0;j+1<n;j++)
            {
                if(cp==cost[i][n-1])
                {
                    cp=cost[i+1][n-1];
                }
                else if(cp==cost[n-1][j])
                {
                    cp=cost[n-1][j+1];
                }
                else{
                cp=min(cost[i][j+1],cost[i+1][j]);
                sum+=cp;}
            }
        }
        return sum+cost[n-1][n-1];
    }

public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int tc=sc.nextInt();
        for(int t=0;t<tc;t++)
        {
            int n=sc.nextInt();
            int cost[][]=new int[n][n];
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    cost[i][j]=sc.nextInt();
                }
            }
        
        System.out.println(solve(cost,n));
        }
    }}