import java.io.*;
class chefsum 
{
    public static void main(String a[]) throws IOException
    {
        BufferedReader b1=new BufferedReader(new InputStreamReader(System.in));
        int tc=Integer.parseInt(b1.readLine());
        for(int t=0;t<tc;t++)
        {
            int n=Integer.parseInt(b1.readLine());
            int ar[]=new int[n];
            int ar1[]=new int[n];
            for(int i=0;i<n;i++)
            {
                ar[i]=Integer.parseInt(b1.readLine());
            }
            for(int i=0;i<n;i++)
            {
                ar1[i]=(prefix(ar,i+1)+suffix(ar,i+1));
            }
            System.out.println(find_smallest(ar1)+1);
        }
        
    }
    static int prefix(int ar[],int i)
    {
        int sum=0;
        for(int j=0;j<i;j++)
        {
            sum+=ar[j];
        }
        return sum;
        
    }
    static int suffix(int ar[],int i)
    {
        int sum=0;
        int len=ar.length;
        int n=len-i+1;
        for(int j=len-1;j>=len-n;j--)
        {
            sum+=ar[j];
        }
        return sum;   
    }
    
    static int find_smallest(int arr[])
    {
        int index=0;
        int min=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
                index=i;
            }
        }
        return index;
    }
    
}
