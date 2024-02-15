package programs.pattern;

////				1
//				1		1
//			1		2		1
//		1		3		3		1
//
//


public class PascalTriangle {
	
	int bin,p,q,r,x;
	
	public PascalTriangle() {
		// TODO Auto-generated constructor stub
		r=4; // no of rows
		bin=1;
		q=0;
		System.out.println(" Pascal's Triangle ");
		
		while(q<r) {
			for(p=40-3*q;p>0;--p) {
				System.out.print(" ");
			}
			for(x=0;x<=q;++x) {
				if((x==0)||(q==0)) {
					bin=1;
				}
				else 
					bin=(bin*(q-x+1))/x;
				
				System.out.print("     ");
				System.out.print(bin);
				
			}
			System.out.println("");
			++q;
		}
			
	}

}
