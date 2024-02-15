package matrix;

import java.util.Scanner;

public class MatrixCreation {
	Scanner sc=new Scanner(System.in);

	public int[][] createMatrix(){
		System.out.println("---Matrix Creation---\n enter row and col");
		int n=sc.nextInt();
		int m=sc.nextInt();
		
		int a[][]=new int[n][m];
		//int a[][];
		for (int i=0;i<n;i++) {
			for (int j=0;j<m;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		
		return a;
	}
}
