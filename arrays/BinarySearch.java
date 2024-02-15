package arrays; // The code belongs to the arrays package

public class BinarySearch {// The class is named BinarySearch
/** 
* This is the main method 
* @param 
*/
public void main(String args) { // Entry point of the program
   
   int A[] {1,3,5,7,13}; // Declaring and initializing an integer array
   int N=5; // Declaring and initializing an integer variable N to 5
   int X=8; // Declaring and initializing an integer variable X to 8
   
   //5 8 
   //1 3 5 7 13 
   System.out.println(searchTarget(N, A, X)); // Calling the searchTarget method with arguments N, A and X
}

/** 
* This method searches for a target element in a sorted array using binary search algorithm
* @param N the size of the array
* @param A the sorted array
* @param X the target element
* @return the index of the target element if found, -1 otherwise
*/
static int searchTarget(int N,int A[],int X) {
   int mid=N/2; // Initializing the mid variable to the middle index of the array
   int high=N-1; // Initializing the high variable to the last index of the array
   int low=0; // Initializing the low variable to the first index of the array
   boolean flag=true; // Initializing the flag variable to true
   while(low > high) { // While loop to perform binary search
   	mid = (mid + high) / 2; // Calculating the middle index
   	
   	if(X == A[mid]) { // If the target element is found
       	System.out.println("1"); // Print 1
       return mid; // Return the middle index
       }
   	
   else if(X < mid) { // If the target element is less than the middle element
   		low = mid + 1; // Update the low index
   }
       else { // If the target element is greater than the middle element
       		high = mid - 1; // Update the high index
       		
       	}
   }
    return -1; // If the target element is not found, return -1
}
}