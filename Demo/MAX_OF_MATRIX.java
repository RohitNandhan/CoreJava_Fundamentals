package Demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import randomNumber.Examples;

public class MAX_OF_MATRIX {

	public static void main(String[] args) {
		
		int vertexCount = 3;
		Random ran =new Random();
		
		//ArrayList<ArrayList<Integer>> M=new ArrayList<>(vertexCount);
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<ArrayList<Integer>> M = new ArrayList<>();
      //  M.add([1,2,5,7],[2,6,7,3],[12,3,2,4],[3,6,9,4]);
        for (int i = 0; i < n; i++) {
            ArrayList<Integer>temp = new ArrayList<>();
            for (int j = 0; j < m; j++) {
                temp.add(ran.nextInt(1000));
                System.out.println("temp "+temp.get(j));
            }
         //   System.out.println("temp "+temp.get(i));
            M.add(temp);
//            2 9 3 5
//
//            2 5 4 0
//
//            5 2 8 5
        }
      // System.out.println(M.get(0).get(1));
     //  System.out.println(M.size());
//     System.out.println(M.get(1).size());
       
        int result = largestForwardDiagonal1(M);
        System.out.println(result+" result");
        sc.close();
	}

	private static int largestForwardDiagonal(ArrayList<ArrayList<Integer>> m) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr=new ArrayList<>();
		int sum=0;
		for(int i=0;i<m.size();i++) {
			for(int j=0;j<m.get(i).size();j++)
			{
				for(int k=0;k<m.size();k++) {
					if(i+k<m.size() && j+k<m.get(i).size())
					sum+= m.get(i+k).get(j+k);
				}
				arr.add(sum);
				 sum=0;
				
				
			}
	} 
		return Collections.max(arr);
}
	
	static int largestForwardDiagonal1(ArrayList<ArrayList<Integer>>M){
		int max=0;
		for(int i=0;i<M.size();i++) {
		
		int row=0,col=i;
        
        int sum1=0,sum2=0;
            while(row<M.size() && col<M.get(i).size()){
            	
            	
                sum1 += M.get(row).get(col);
                if(col<M.size())
               sum2 += M.get(col).get(row);
                row++;
                col++;
                   }
            max =Math.max(max, Math.max(sum1, sum2));
		}
            
      return max;
    }
}

