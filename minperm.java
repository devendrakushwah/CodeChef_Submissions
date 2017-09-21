import java.util.*;
class minperm {

	private final int[] data;
	
	public minperm(int[] init) {
		this.data = init.clone();
	}
	
	public void print() {
		permute(data, 0, data.length);
                String s;
                for(int i=0;i<data.length;i++)
                {
                    System.out.println(data[i]);
                }
                
	}

	private static void rotateLeft(int[] v, int i, int n) {
		int t = v[i];
		for (int j = i+1; j < n; j++) v[j-1] = v[j];
		v[n-1] = t;
	}

	private void permute(int[] v, int start, int n) {
		System.out.println(Arrays.toString(v));
		if (start < n) {
			for (int i = n - 2; i >= start; i--) {
				for (int j = i + 1; j < n; j++) {
					int t = v[i]; v[i] = v[j]; v[j] = t; // swap
					permute(v, i+1, n);
				}
				rotateLeft(v, i, n);
			}
		}
	}

	public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
                int data[]=new int[n];
                for(int i=0;i<n;i++ )
                {
                    data[i]=i+1;
                }
		minperm p = new minperm(data);
		p.print();
	}

}