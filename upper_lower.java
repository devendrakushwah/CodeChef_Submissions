
import java.util.*;
class upper_lower
{
    public static void main(String args[] ) throws Exception 
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        char[] ar = new char[s1.length()];
        for(int i=0;i<s1.length();i++)
        {
            char c1=s1.charAt(i);
            int i1=((int)c1);
            if(i1>=65&&i1<97)
            {
                ar[i]=(char)(i1+32);
            }
            else
            {
                ar[i]=(char)(i1-32);
                
            }
        }
        for(int i=0;i<s1.length();i++)
        {
        System.out.print(ar[i]);
        }
        
    }
}