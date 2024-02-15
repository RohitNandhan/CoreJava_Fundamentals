package arrays;

public class MaxTwoProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arr[]= {1,2,5,4,6};
		int max1=0;
		int index=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max1) {
				max1=arr[i];
				index=i;
				//arr[i]=arr[i-1];
				
			}
		
		} 
		//System.out.println(max1);
		
		int max2=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max2 && i!=index) {
				max2=arr[i];
				//arr[i]=arr[i-1];
				
			}
		
		} System.out.println((max1-1)*(max2-1));
		
		
		
		
		
		
		
		
		
		
		
	}

	
}
