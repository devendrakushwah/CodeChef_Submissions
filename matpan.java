import java.util.*;
class matpan 
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int price[]=new int[26];
        int cost;
        int cost1[]=new int[t];
        for(int i=0;i<t;i++)
        {   cost=0;
            for(int j=0;j<26;j++)
            {
                price[j]=sc.nextInt();
            }
            String s=sc.next();
            char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
            for(int z=0;z<alphabet.length;z++)
            {
                if(!found(alphabet[z],s))
                {
                    cost+=price[z];
                }
            }
            cost1[i]=cost;
        }
       for(int k=0;k<cost1.length;k++)
       {
           System.out.println(cost1[k]);
       }
    }
    
    
    
    static boolean found(char c,String s)
    {
        boolean ans;
        int flag=0;
        if(s.indexOf(c)>=0)
        {
            ans=true;
        }
        else ans=false;
        return ans;
        
    }
}
