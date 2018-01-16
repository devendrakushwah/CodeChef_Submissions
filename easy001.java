import java.util.*;
class easy001 
{
   static  ArrayList <Integer>list=new ArrayList <Integer>();
   static  int a;
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        while((a=sc.nextInt())!=42)
        {   
            list.add(a);
        }
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i)==42)
            {
                break;
            }
            else
            {
                System.out.println(list.get(i));
            }
        }
    }
    
}
