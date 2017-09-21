import java.util.*;
 
class Ideone
 
{
 
	public static void main (String[] args) throws java.lang.Exception
 
	{
                Scanner s = new Scanner(System.in);
 
		int t,n,flag;
 
		t = s.nextInt();
 
		while(t!=0){
 
	    	flag = 0;
 
			n = s.nextInt();
 
			int arr[] = new int[n];
 
			for(int i=0;i<n;i++){
 
				arr[i] = s.nextInt();
 
			}
 
			if(n%2==0 || arr[0] != 1){
 
				flag = 1;
 
			}
 
			else 
 
			{
 
				for(int i=1;i<=n/2;i++){
 
				if(arr[i]  != arr[i-1] + 1 ){
 
					flag = 1;
 
					break;
 
					}
 
				}
 
				for(int i=n/2+1;i<n;i++){
 
					if(arr[i] + 1 != arr[i-1]){
 
						flag = 1;
 
						break;
 
					}
 
				}
 
			}
 
			if(flag==0){
 
				System.out.println("yes");
 
			} else {
 
				System.out.println("no");
 
			}
 
			t--;
 
		}
 
		
	}
 
} 