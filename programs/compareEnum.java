package PracticePrograms.coreJava.programs;

public class compareEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String c="carr";
//		if(Var.car.name().equals(c)) {
//			System.out.println("pass");
//		}
//		else {
//			System.out.println("fail");
//		}
		if(Var.values().equals(c)) {
			System.out.println("pass");
		}
		else {
			System.out.println(Var.valueOf(c));
		}

	}
	Object oj=new Object();

}

enum Var{
	//car,
	carr
}
