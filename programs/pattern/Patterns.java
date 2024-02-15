package programs.pattern;

public class Patterns {
	
	int row;
	
}

class RightTrianglePattern extends Patterns{
	/*#
	 *# #
	 *# # #
	 *# # # #
	 *# # # # #
	*/
	public RightTrianglePattern(int row) {
		// TODO Auto-generated constructor stub
		this.row=row;
	for(int i=0;i<row;i++) {
		for(int j=0;j<=i;j++) {
			System.out.print("* ");
		} System.out.println();
	}
	
	}
}

class LeftTrianglePattern extends Patterns{
//		  	* 
//		  * * 
//	    * * * 
//	  * * * * 
//	* * * * * 
	public LeftTrianglePattern(int row) {
		// TODO Auto-generated constructor stub
	this.row=row;
	for(int i=0;i<row;i++) {
		for(int j=2*(row-i);j>0;j--) {
			System.out.print(" ");
		}
		for(int j=0;j<=i;j++) {
			System.out.print("* ");
		}
		System.out.println();
	}
	
	
	}
}

class PyramidStarPattern extends Patterns{
//	
//		    *           
//		   * *         
//		  * * *       
//		 * * * *     
//		* * * * *   	
	public PyramidStarPattern(int row) {
		// TODO Auto-generated constructor stub
	this.row=row;
	for(int i=0;i<row;i++ ) {
		for(int j=(row-i);j>0;j--) {
			System.out.print(" ");
		}
		for(int k=0;k<=i;k++) {
			System.out.print("* ");
		}
		System.out.println();
	}
	}
}

class DownwardTrianglePattern extends Patterns{
	public DownwardTrianglePattern(int row) {
		// TODO Auto-generated constructor stub
		this.row=row;
		for(int i=row-1;i>=0;i--) {
			for(int j=0;j<=i;j++) {
				System.out.print("*"+" ");
			}System.out.println();
		}
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	