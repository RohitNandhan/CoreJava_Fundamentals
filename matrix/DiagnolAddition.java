package matrix;

import java.util.Scanner;

public class DiagnolAddition {
	 public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int a[][] = new int[n][n];
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++)
	                a[i][j] = sc.nextInt();
	        }

	        int result = AdiagnalSum(n, a);
	        System.out.println(result);
	    }

	    // TODO: Implement this method
	    static int diagonalSum(int n, int[][] a) {
	        int sum=0;
	        for(int i=0;i<a.length;i++){
	            sum+=a[i][i];
	        }
	        return sum;
	    }
	    static int AdiagnalSum(int n,int[][] a) {
	    	int sum=0;
	    	for(int i=0;i<n;i++) {
	    		sum+=a[i][n-1-i];
	    	}
	    	return sum;
	    }
	
}
