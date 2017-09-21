import java.util.*;

public class chefmover 
{
        public static void main(String[] args)  {
        Scanner sc=new Scanner (System.in);
        int testCases = sc.nextInt();
        while(testCases-- > 0) {
            int n = sc.nextInt();
            int d = sc.nextInt();
            long[] arr = new long[n + 1];
            long sum = 0, bucket, counter = 0, difference;
            for(int i = 1; i <= n; i++) {
                sum += arr[i] = sc.nextLong();
            }
            bucket = sum / n;
            if(sum % n == 0) {
                for(int i = 1; i <= n - d; i++) {
                    difference = arr[i] - bucket;
                    counter += Math.abs(difference);
                    arr[i + d] += difference;
                }
                for(int i = n - d + 1; i <= n; i++) {
                    if(arr[i] != bucket) {
                        counter = -1;
                        break;
                    }
                }
            } else {
                counter = -1;
            }
            System.out.println(String.valueOf(counter));
        }
    }
}