package PracticePrograms.coreJava.programs;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
		int n=11;
//		PrimeCount pc=new PrimeCount();
//		int count=pc.findPrime2(n);
//		System.out.println("count"+count);
		
		PrimeOrNot pn=new PrimeOrNot();
		System.out.println("the given number "+n+" is prime :"+pn.findPrime(n));
		

		}
	}
	
	
	class PrimeCount {
		// no of prime number in the given range
	public int findPrime1(int n) {
		int count=n-1;
		
		for(int i=2;i<=n;i++) {
			boolean flag=false;
			
			for(int j=2;j<=i-1;j++) {
				if(i%j==0 ) {
					flag=true;
				}
					
				} if(flag==true) {
					count--;
				}else {
					System.out.println(i);
				}
			}
		return count;
		
	}
	public int findPrime2(int n) {
		int count=n-1;
		
		for(int i=2;i<=n;i++) {
			boolean flag=false;
			
			for(int j=2;j<=Math.sqrt(i);j++) {
				int f1=j,f2=i/j;
				if(i%f1==0 || i%f2==0 ) {
					flag=true;
				}
					
				} if(flag==true) {
					count--;
				}else {
					System.out.println(i);
				}
			}
		return count;
		
	}
	
	}
//	class PrimeOrNot{
//		public boolean findPrime(int n) {
//			// using n=m/2
//		int i,m=0;
//		boolean	flag=true;
//		//int n=3;
//		m=n/2;
//		if((n==0)||(n==1)){
//			flag=false;
//			
//		}else {
//			for(i=2;i<=m;i++) {
//				if(n%m==0) {
//					flag=false;
//				}
//			}
//		}return flag;
//		
//	}
//		public boolean findPrime2()
//	}
	

