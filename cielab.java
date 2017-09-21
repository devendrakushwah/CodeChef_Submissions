import java.util.*;
class cielab
{
    
        
    public static void main(String ar[]){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=a-b;
    String ans=Integer.toString(c);
    Random random = new Random();
    int rn1 = random.nextInt(ans.length());
    int rn2 = random.nextInt(9);
    char ch[]={'1','2','3','4','5','6','7','8','9'};
    char ch2[]=ans.toCharArray();
    ch2[rn1]=ch[rn2];
    for(int i=0;i<ch2.length;i++)
    {
     System.out.print(ch2[i]);   
    }
    
}   
}
