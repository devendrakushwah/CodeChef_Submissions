import java.util.*;
public class cookoff_aug 
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            float v1=sc.nextFloat();
            float v2=sc.nextFloat();
        float t1=(1.414f*n)/v1;
        float t2=(2*n)/v2;
        if(t2>t1)
        {
            System.out.println("Stairs");
        }
        else if(t2<t1)
        {
            System.out.println("Elevator");
        }
        }
    }
    
}
