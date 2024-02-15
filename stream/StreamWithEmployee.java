package stream;


	
	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.Collection;
	import java.util.Iterator;
	import java.util.List;
	import java.util.stream.Collector;
	import java.util.stream.Collectors;

	public class StreamWithEmployee {

	    
		/** 
		 * @param args
		 */
		public static void main(String[] args) {
	        findNameA();
	        findNameAWithStream();
	    }

	    public static void findNameA(){
	        List<Employee> employeesList = getListOfEmployees();
	        List<Employee> tempList = new ArrayList<Employee>();
	        
	        // Complete the logic to print the list of employees whose name starts with ‘A’
	        Iterator<Employee> it=employeesList.iterator();
	        while(it.hasNext()){
	            Employee emp=it.next();
	            if(emp.name.startsWith("A")){
	                tempList.add(emp);
	            }
	        }


	        for(Employee e : tempList){
	            System.out.println("Name :- " + e.name +" ,Designation :- " + e.role + " , Age :- " + e.age);
	        }
	    }

	    public static void findNameAWithStream(){
	        List<Employee> employeesList = getListOfEmployees();
	       List<String> employeeNames= employeesList.stream().map(e-> e.name).filter(e->e.contains("o")).toList();
	       List<Employee> sortedList=employeesList.stream().sorted((e1,e2)->(e2.age-e1.age)).collect(Collectors.toList());
	        System.out.println(employeeNames);
	        //sortedList.stream().forEach(System.out::print);
	        //System.out.println(sortedList);
	        for(Employee e : sortedList){
	            System.out.println("Name :- " + e.name +" ,Designation :- " + e.role + " , Age :- " + e.age);
	        }
	    }
	 
	    public static List<Employee> getListOfEmployees() {
	 
	        List<Employee> listOfEmployees = new ArrayList<>();
	 
	        Employee e1 = new Employee("Mohan", Arrays.asList("Newyork","Banglore"),24,"Manager");
	        Employee e2 = new Employee("John", Arrays.asList("Paris","London"),27,"General Manager");
	        Employee e3 = new Employee("Ronan", Arrays.asList("Pune","Seattle"),32,"Developer");
	        Employee e4 = new Employee("Amit", Arrays.asList("Chennai","Hyderabad"),22,"Manager");
	 
	        listOfEmployees.add(e1);
	        listOfEmployees.add(e2);
	        listOfEmployees.add(e3);
	        listOfEmployees.add(e4);
	 
	        return listOfEmployees;
	    }
	}



