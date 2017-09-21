import java.util.*;
class obtuse 
{
    public static void main(String ar[])
    {

            Scanner sc=new Scanner(System.in);
        
        int t=sc.nextInt();
        int count=0;
        for(int i=0;i<t;i++)
        {
            int k=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            int arr[]=new int[k];
            for(int z=0;z<k;z++)
            {
                arr[z]=z+1;
            }
            for(int n=0;n<k;n++)
            {
                if(arr[n]!=arr[a-1] && arr[n]!=arr[b-1]){
                if(arr[b-1]<arr[a-1]+(k/2f) && arr[n]<arr[b-1])
                {
                    count++;   
                }
            }}
              System.out.println(count);
              count=0;
            }

        }
    }

