package PracticePrograms.coreJava.variables;

class Operation{  
	float radius;
 public Operation(int i) {
		this.radius=i;
 }

/** 
 * @return float
 */
float square(){  
  return radius*radius;  
 }  
}  
  
class Circle{  
 //Operation op;//aggregation  
 double pi=3.14;
 Operation radius;    
 public Circle(Operation op) {
	this.radius=op;
	
}

double area(){  
  //Operation radius
// op=new Operation();  
   float rsquare=radius.square(); 
   return pi*rsquare;
	//return pi*obj.radius;
 }  
}
class AggregationExample2
{
  
 public static void main(String args[]){  
Operation op=new Operation(5);	 
   Circle c=new Circle(op);
   double area=c.area(); 
   System.out.println("area :\t"+area);
 }  
}  