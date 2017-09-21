import java.util.*;
class codevita 
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String sub;
        int tc=sc.nextInt();
        ArrayList <String> list=new ArrayList<String>();    // arraylist named list
        for(int t=0;t<tc;t++)
        {
            int l=sc.nextInt();
            int p=sc.nextInt();
            int nos=s.length()-l+1;                 // no. of substrings
            String arr[]=new String[nos];
            System.out.println(t+1);
            
            for(int i=0;i+l<=s.length();i++)
            {
                arr[i]=s.substring(i, i+l);
            }
            for(int x=0;x<arr.length;x++)
            {
                if(count(arr[x],arr)==p)
                {
                   list.add(arr[x]); 
                }
                
            }
            for(int i=0;i<list.size();i++){
                for(int j=i+1;j<list.size();j++){
                    if(list.get(i).equals(list.get(j))){
                        list.remove(j);
                        j--;
                    }
                }
            }
            Iterator it=list.iterator();
            while(it.hasNext())
            {
                System.out.println(it.next());
            }
        }
    }
    static  int count(String sub,String s[])    // to count no. of occureces of substring in array
    {
        int c=0;
         for(int i=0;i<s.length;i++)
        {
            if(sub.equals(s[i])) c++;
        }
        return c;
    }
}
