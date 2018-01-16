import java.util.*;
class johny 
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();
        for(int t=0;t<tc;t++)
        {
            int n=sc.nextInt();
            int songs[]=new int[n];
            for(int n1=0;n1<n;n1++)
            {
                songs[n1]=sc.nextInt();
            }
            int k=sc.nextInt();
            int johny=songs[k-1];
            Arrays.sort(songs);
            int pos=pos(johny,songs);
            System.out.println(pos+1);
        }
    }
    static int pos(int in,int ar[])
    {
        int pos=0;
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]==in)
            {
                pos=i;
                break;
            }
        }
        return pos;
    }
}
