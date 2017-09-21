import java.util.*;
public class templela 
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            int arr[]=new int[n];
            boolean valid=true;
            for(int j=0;j<n;j++)
            {
                arr[j]=sc.nextInt();
            }
            for(int j=0;j<n/2;j++)
            {
                if((arr[j+1]-arr[j])!=1) valid=false;
            }
            for(int j=n/2;j<n;j++)
            {
                if((arr[j]-arr[j-1])!=1) valid=false;
            }
             if(n%2 != 0 && arr[0]==1 && valid==true) System.out.println("yes");
             else System.out.println("no");
        }
        
    }
    
}
