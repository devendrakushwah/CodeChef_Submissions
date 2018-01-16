import java.util.*;
class chefgp 
{
    public static void main(String ar[])
    {
        ArrayList <Character> list= new ArrayList<Character>();
        Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();
        for(int t=0;t<tc;t++)
        {
            String s=sc.next();
            int x=sc.nextInt();
            int y=sc.nextInt();
            char ch[]=s.toCharArray();
            for(int i=0;i<ch.length;i++)
            {
                list.add(ch[i]);
            }
            int a=0,b=0;
            String sa,sb;
            for(int i=0;i+x<s.length() ;i++)
            {
                sa=s.substring(i,i+x+1);
                if(check(sa,'a'))
                {
                    list.add(i,'b');
                }
            }
             for(int i=0;i+y<s.length();i++)
            {
                sb=s.substring(i,i+y+1);
                if(check(sb,'b'))
                {
                   list.add(i,'a');
                }
            }
        System.out.println(list);
        }

        }
    
    
    static boolean check(String s,char c)
       {
        boolean res=true;
        int flag=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=c)
            {
                flag++;
            }
        }
        if(flag!=0)
        {
            res=false;
        }
        return res;
    }
    
}
