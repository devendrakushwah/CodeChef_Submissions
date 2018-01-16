import java.util.*;
class atmoq3 
{
   static  int x,y,l,r,parity=0;
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int q=sc.nextInt();
        
        int sum=0;
        int arr[]=new int[n];
        for(int n1=0;n1<n;n1++)
        {
            arr[n1]=sc.nextInt();
            
        }
        for(int q1=0;q1<q;q1++)
        {
        int choice=sc.nextInt();
        if(choice==1)
        {
           x=sc.nextInt();
           y=sc.nextInt();
           arr[x-1]+=y;
        }
        if(choice==2)
        {
            l=sc.nextInt();
            r=sc.nextInt();
            parity=sc.nextInt();
        
            if(parity==1)
            {
                for(int i=l-1;i<=r-1;i++)
                {
                    if((arr[i]%2)!=0)
                    {
                        sum+=arr[i];
                    }
                }
            }
            if(parity==0)
            {
                for(int i=l-1;i<=r-1;i++)
                {
                    if((arr[i]%2)==0)
                    {
                        sum+=arr[i];
                    }
                }
            }
                    System.out.println(sum);
                    sum=0;
        }

    }}}

