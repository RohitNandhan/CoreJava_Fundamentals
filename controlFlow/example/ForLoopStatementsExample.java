package controlFlow.example;

public class ForLoopStatementsExample {
		public ForLoopStatementsExample() {
			// TODO Auto-generated constructor stub
		System.out.println("For Loop Statement Examples: \n");
		
		}
}
class NestedForExample extends ForLoopStatementsExample{
	public NestedForExample() {
		// TODO Auto-generated constructor stub
	
		for(int i=1; i<3;i++) {
			for(int j=1;j<=3;j++) {
				System.out.println(i+""+j);
			}
		}
	}
}
class PyramidExample extends ForLoopStatementsExample{
	public PyramidExample() {
		// TODO Auto-generated constructor stub
	
	for(int i=1;i<=5;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print("x ");
		}System.out.println();
	}
}
}

class PyramidExample2 extends ForLoopStatementsExample{
	public PyramidExample2() {
		// TODO Auto-generated constructor stub
		int end=5;
		for(int i=1;i<=end;i++) {
			for(int j=end;j>=i;j--) {
				System.out.print(". ");
			}System.out.println("");
		}
		
	}
}

class ForEachExample extends ForLoopStatementsExample{
	public ForEachExample() {
		// TODO Auto-generated constructor stub
	int arr[]= {12,22,33,44,65};
	int i=1;
	for(int a:arr) {
		System.out.println(i+":"+a);
		i++;
	}
	}
}

class LabeledForExample extends ForLoopStatementsExample{
	public LabeledForExample() {
		// TODO Auto-generated constructor stub
	aa: for(int i=1;i<=3;i++) {
		bb: for(int j=1;j<=3;j++) {
			if( i==2 && j==2) {
				break bb;
				
			}System.out.println(i+" : "+j);
		}
	}
	}
	
}

class InfinitiveLoopsExample extends LabeledForExample{
	public InfinitiveLoopsExample() {
		// TODO Auto-generated constructor stub
	for(;;) {
	System.out.println("$");
	}
	}
	
}
