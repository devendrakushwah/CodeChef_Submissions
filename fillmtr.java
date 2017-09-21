import java.util.*;
class fillmtr 
{
    public static void main(String ar[])
    {
    
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
	for(int tc=0;tc<t;tc++){
		int n,q;
                n=sc.nextInt();
                q=sc.nextInt();
		int arr[][]=new int[n][n];
		for(int x=0;x<n;x++){
                    for(int y=0;y<n;y++)
                    {
                        
			arr[x][y]=sc.nextInt();
                    }

		int flag=0;

		for(int p=0;p<q;p++){
			int i,j,val;
			i=sc.nextInt();
                        j=sc.nextInt();
                        val=sc.nextInt();
			arr[i-1][j-1]=val;
		}
		//left diagonal should be zero
		for(int i=0;i<n;i++){
			if(arr[i][i]!=-1&&arr[i][i]!=0){
				flag=1;
				break;
			}
		}

		//checking refected numbers
		if(flag==0){
			for(int i=0;i<n;i++){
				for(int j=i+1;j<n;j++){
					if(arr[i][j]!=-1&&arr[j][i]!=-1&&arr[i][j]!=arr[j][i]){
						flag=1;
						break;
					}
				}
			}
		}

		if(flag==0){
			for(int gap=1;gap<n-1;gap++){
				for(int i=0,j=gap;j<n-1;j++,i++){

					if(arr[i][j]!=-1&&arr[i+1][j+1]!=-1){
					if(arr[i][j+1]!=-1&&arr[i][j]+arr[i+1][j+1]!=arr[i][j+1]){
						flag=1;break;
					}
					else
						if(arr[i][j+1]==-1)
						arr[i][j+1]=arr[i][j]+arr[i+1][j+1];
					}
				}
			}
		}

		if(flag==0){
			//check lower-half
			for(int i=0;i<n;i++){
				for(int j=i+1;j<n;j++){
					if(arr[j][i]!=-1&&arr[i][j]!=arr[j][i]){
						flag=1;
						break;
					}
				}
			}
		}
		if(flag==1)
			System.out.println("no");
		else
			System.out.println("yes");
        }
    
}
    }}

