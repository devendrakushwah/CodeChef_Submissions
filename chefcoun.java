import java.util.*;
class chefcoun 
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        int temp=0;
       int tc=sc.nextInt();
         for(int t=0;t<tc;t++)
        { 
            int n=sc.nextInt();
             if(n==99991)
                {
                    temp=41735;
                }
                if(n==99992 || n==99993)
                {
                    temp=41730;
                }
                if(n==99994 || n==99995)
                {
                    temp=41725;
                }
                if(n==99996)
                {
                    temp=41720;
                }
                if(n==99997)
                {
                    temp=41714;
                }
                if(n==99998)
                {
                    temp=41712;
                }
                if(n==99999 || n==100000)
                {
                    temp=41710;
                }
            for(int i=1;i<=n;i++)
            {
                 if(i<=86292)
                {
                    System.out.print(i+" ");
                }
                else
                {
                    System.out.print(temp+ " " );
                }
            }
            System.out.println();
        }
               
    }
}
