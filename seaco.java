import java.util.*;
class seaco 
{
    public static void main(String brgs[])
    {
        Scanner sc=new Scanner (System.in);
        int tc=sc.nextInt();
        for(int t1=0;t1<tc;t1++)
        {
            int n=sc.nextInt();
            int m=sc.nextInt();
            int []ar=new int[n];
            for(int i=0;i<ar.length;i++)
            {
                ar[i]=0;
            }
            int cmd[][]=new int[m][3];
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<3;j++)
                {
                    cmd[i][j]=sc.nextInt();  // stored commands in a m*3 array
                    int x=cmd[i][1];
                    int y=cmd[i][2];
                    int l=x-1;
                    int r=y-1;
                    if(cmd[i][0]==1)
                    {
                        command1(ar,l,r);
                    }
                    if(cmd[i][0]==2)
                    {
                        command2(ar,cmd,l,r);
                        
                    }
                }
            }
           for(int i=0;i<n;i++)
           {
               System.out.print(ar[i]+" ");
           }
           System.out.println();
        }
    }
    static void command1(int ar[],int l,int r )
    {       
        if(r!=ar.length)
        {
            
            for( int i=l;i<r;i++)
            {
                ar[i]+=1;
                ar[i+1]+=1;
            
            }
        }
    }
   static void command2(int ar[],int cmd[][],int l,int r )
    {
        for(int i=l;i<r;i++)
        {
            if(cmd[i][0]==1)
            {
                command1(ar,cmd[i][1],cmd[i][2]);
            }
            else
            {
                command2(ar,cmd,cmd[i][1],cmd[i][2]);
            }
        }
    }
    
}
