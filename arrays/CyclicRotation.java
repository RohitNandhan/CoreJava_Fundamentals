package arrays;

public class CyclicRotation {
	public static void main(String[] args) {
		
		int arr[]= {1,2,4,5,6,3,2,11,13,15};
		int k=5,n=10,temp=0;
		int arr1[]=new int[n];
		for(int i=0;i<n-k;i++) {
			arr1[k+i]=arr[i];
		}
		for(int i=0;i<k;i++) {
			arr1[i]=arr[n-k+i];
		}
//	
//	
//	for(int i=0;i<n-k;i++) {
//		System.out.println(arr[i]);
//	}
		
//		for(int i=0;i<n-k;i++) {
//			temp=arr[i];  // 1 2 1
//			arr[i]=arr[k-i]; // 0-3 1-2 2-3
//			arr[k-i]=temp;   // 2-1 1-2 
////			System.out.println(k-i+"--"+temp);
//			System.out.println(i+"-"+arr[i]);
//		}
		for(int i=0;i<n;i++) {
			System.out.println(arr1[i]);
		}
		
		

}
}
