import java.util.*;
class marrays 
{
    static ArrayList <Integer>list=new ArrayList <Integer>();
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();
        for(int t=0;t<tc;t++)
        {
            int sum=0;
            int n=sc.nextInt();
            int arr[][]=new int[n][];
            for(int n1=0;n1<n;n1++)
            {
                int m=sc.nextInt();
                arr[n1]=new int[m];
                for(int m1=0;m1<m;m1++)
                {
                    arr[n1][m1]=sc.nextInt();
                }
            }
            for(int i=0;i+1<arr.length;i++)
            {
                list.add((i+1)*abs(arr[i],arr[i+1]));
            }
            for(int i=0;i<list.size();i++)
            {
                sum+=list.get(i);
            }
            list.clear();
            System.out.println(sum);
        }
    }
    static int abs(int ar1[],int ar2[])
    {
        int abs1=Math.abs(asc_sort(ar1)[ar1.length-1]-asc_sort(ar2)[0]);
        int abs2=Math.abs(desc_sort(ar1)[ar1.length-1]-asc_sort(ar2)[0]);
        int abs3=Math.abs(asc_sort(ar1)[ar1.length-1]-desc_sort(ar2)[0]);
        int abs4=Math.abs(desc_sort(ar1)[ar1.length-1]-desc_sort(ar2)[0]);
        int temp1=Math.max(abs1,abs2);
        int temp2=Math.max(temp1,abs3);
        return Math.max(temp2, abs4);
    }
    
    static int[] asc_sort(int ar[])
    {
        Arrays.sort(ar);
        return ar;
    }
    static int[] desc_sort(int ar[])
    {
 for(int i=0;i<ar.length;i++)
        {
            ar[i]=(-1)*ar[i];
        }
        Arrays.sort(ar);
       for(int i=0;i<ar.length;i++)
        {
            ar[i]=(-1)*ar[i];
        }
       return ar;
    }
            }
