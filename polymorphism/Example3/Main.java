package Java2.Polymorpism;

public class Main {

	public static int main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
		System.out.println("with string[] args");
			main();
			return 0;
			
	}
	
	public static void main(String args) {
		System.out.println("with string args");
	}
	
	public static void main() {
		System.out.println("without args");
		main("hai");
	}
	
	int display(int a) {
		return a;
	}
	
	void display(int a, int b) {
		
	}

}
