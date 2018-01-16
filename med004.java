import java.util.*;
class med004 
{
    static ArrayList <Character>list= new ArrayList <Character>();
    static ArrayList <Character>copy= new ArrayList <Character>();
    public static void main(String ar[])
    {
        int count=0;
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        String s=sc.next();
        char ch[]=s.toCharArray();
        for(int i=0;i<a;i++)
        {
            list.add(ch[i]);
        }
           int c=count('c',list);
           int o=count('o',list);
           int d=count('d',list);
           int e=count('e',list);
           int h=count('h',list);
           int f=count('f',list);
           while(true)
           {
               if(c<2&&e<2&&o<1&&d<1&&h<1&&f<1)
               {
                   break;
               }
               c-=2;o--;d--;e-=2;h--;f--;
               count++;
           }
        System.out.println(count);
    }
    static boolean found(char c,ArrayList<Character>ls)
    {
        boolean ans=false;
        for(int i=0;i<ls.size();i++)
        {
            if(ls.get(i)==c)
            {
                ans=true;
                break;
            }
        }
        return ans;
    }

static int count(char c,ArrayList<Character>ls)
{
    int count=0;
for(int i=0;i<ls.size();i++)
{
    if(ls.get(i)==c)
    {
        count++;
    }
}
    return count;
}
}