import java.util.*;
 
class test {
    private static String solve(String ns)
    {
        int[] arr = new int[10];
        for(int i=0;i<ns.length();i++)
        {
            arr[Integer.parseInt(Character.toString(ns.charAt(i)))]++;
        }
        int[] ansa = new int[26];
        for(int i=65;i<=90;i++)
        {
            int a = i/10, b = i%10;
            int[] ar = arr.clone();
            if(ar[a]==0){continue;}
            ar[a]--;
            if(ar[b]==0){continue;}
            ansa[i-65]++;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<ansa.length;i++)
        {
            if(ansa[i]>0)
            {
                sb.append((char)(65+i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int tc = sc.nextInt();
        for(int t=0;t<tc;t++)
        {
            String s = sc.next();
            String ans = solve(s);
            if(ans.length()>0)
            {
                System.out.print(ans);
            }
            System.out.println();
        }
    }
}
 