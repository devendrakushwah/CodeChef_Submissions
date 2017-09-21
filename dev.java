import java.util.*;
class dev {
    static ArrayList <String>list=new ArrayList<String>();
	private final int[] data;
	
	public dev(int[] init) 
        {
		this.data = init.clone();
	}

	private static void rotateLeft(int[] v, int i, int n) {
		int t = v[i];
		for (int j = i+1; j < n; j++) v[j-1] = v[j];
		v[n-1] = t;
	}

	private static ArrayList<String> permute(int[] v, int start, int n) {
		list.add(Arrays.toString(v));
		if (start < n) {
			for (int i = n - 2; i >= start; i--) {
				for (int j = i + 1; j < n; j++) {
					int t = v[i]; v[i] = v[j]; v[j] = t; // swap
					permute(v, i+1, n);
				}
				rotateLeft(v, i, n);
			}
		}
                return list;
	}

	public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                int t=sc.nextInt();
                for(int tc=0;tc<t;tc++)
                {
                    int n=sc.nextInt();
                    int data[]=new int[n];
                    for(int i=0;i<n;i++ )
                    {
                    data[i]=i+1;
                    }
                    ArrayList<String>xyz=permute(data, 0, data.length);
                    for(int i=0;i<xyz.size();i++)
                    {
                        System.out.println(xyz.get(i));
                    }
                }

	}

}