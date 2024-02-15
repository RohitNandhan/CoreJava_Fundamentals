package matrix;

public class MatrixAddition {

	public static void main(String []args)
	{
		//creating two matrix
//		int a[][]= {{1,3,4},{2,4,3},{3,4,5}}; 
//		int b[][]={{1,3,4},{2,4,3},{1,2,4}};
		
		int a[][]=new MatrixCreation().createMatrix();
		int b[][]=new MatrixCreation().createMatrix();
		
		int sum[][]=new int[3][3];
		
		for (int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				sum[i][j]=a[i][j]+b[i][j];
				
				System.out.print(sum[i][j]+" ");
				
				
			}System.out.println();
		}
		
	}
}
