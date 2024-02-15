package variables;

public class VariableTypes {

	static int static_var=1;
	int instance_var=2;
	
		VariableTypes(String string){
			System.out.println("\n"+string);
			System.out.println("printing local variable : "
					+VariableTypes());
			System.out.println("printing instance variable : "
					+instance_var);
			System.out.println("printing static variable : "
					+static_var);
		}
		
		/** 
		 * @return int
		 */
		int VariableTypes(){
		int local_var=3;
		//System.out.println("local var: "+local_var);	
		return local_var;
		
		
	}
	
}
