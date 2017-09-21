import java.util.*;
public class palindrome 
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        ispalin(s);
    }
    

    public static void ispalin(String s)
    {
        int len=s.length();
        int flag=0;
        for(int i=0;i<len;i++)
        {  
            if(s.charAt(i)==s.charAt(len-i-1))
            {
                flag=1;
            }
            else
            {
                flag=0;
            }
        }
        if(flag==1)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }  
}
