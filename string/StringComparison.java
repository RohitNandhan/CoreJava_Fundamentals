package string;

public class StringComparison {

	StringComparison(){
		
		String s="hello";
		String s1="hello";
		String s2="Hello";
		String s3=new String("hello");
		
		System.out.println("s==s1: "+(s==s1));
		System.out.println("s==s2: "+(s==s2));
		System.out.println("s==s3: "+(s==s3));
		System.out.println("s.equals(s1): "+s.equals(s1));
		System.out.println("s.equals(s2): "+s.equals(s2));
		System.out.println("s.equals(s3)" +s.equals(s3));
		String s4=s3.intern();
		System.out.println("s==s3.intern() " +(s==s3.intern()));
		System.out.println("s==s4 " +(s==s4));
		
		System.out.println("s.equalsIgnoreCase(s2)"+s.equalsIgnoreCase(s2));
		
	}
}
