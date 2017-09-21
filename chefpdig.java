import java.util.*;
 
class chefpdig {
    static ArrayList<String>list=new ArrayList<String>();
    static ArrayList<Character>chr=new ArrayList<Character>();
/*static ArrayList<String> permutation(char[] p, int pos, String str) 
{
    
    
    if (pos == p.length) 
    {
        list.add(new String(p));
    } 
    else 
    {
        for (int i = 0 ; i < str.length() ; i++) 
        {
            p[pos] = str.charAt(i);
            permutation(p, pos+1, str);
        }
    }
    return list;
}*/
public static boolean count_1(String s, char c)
{
    int count = 0;
    boolean ans=false;
    for (int i=0; i < s.length(); i++)
    {
        if (s.charAt(i) == c)
        {
             count++;
        }
    }
    if(count==1)
    {
        ans=true;
    }
    return ans;
}
    public static void main (String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();
        for(int t=0;t<=tc;t++)
        {
            String s=sc.nextLine();
            char arr[] = {' ', ' '};
            list=perm(s);
            for(int i=0;i<list.size();i++)
            {                           // to remove dupliactes
                for(int j=i+1;j<list.size();j++)
                {
                    if(list.get(i).equals(list.get(j)))
                    {
                        list.remove(j);
                        j--;
                    }
                }
            }
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            String rem=""+ch+ch;
                if(count_1(s,ch))
                {
                    list.remove(rem);
                }
        }
        Collections.sort(list);
            
        for(int i=0;i<list.size();i++)
        {
            int n=Integer.parseInt(list.get(i));
            if(n>=65 && n<=90)
            {
                chr.add((char)n);
            }
        }
            if(chr.isEmpty())
            {
                System.out.print("\n");
            }
            else{
            for(int i=0;i<chr.size();i++)
            {
                System.out.print(chr.get(i));
            }
            System.out.println();
            chefpdig.chr.clear();
            chefpdig.list.clear();
            }
        }
         
       }
    static ArrayList<String> perm(String str)
    {
        ArrayList<String> list= new ArrayList<String>();
        for(int i=0;i<str.length();i++)
        {
            for(int j=0;j<str.length();j++)
            {
                String temp1=Character.toString(str.charAt(i));
                String temp2=Character.toString(str.charAt(i));
                list.add(temp1+temp2);
            }
        }
        return list;
    }
    }
    