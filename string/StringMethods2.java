package string;

 class StringMethods2 {

	static String s="welcome";
	 
	void simple() {
	char [] ch = {'a','b','c','d'};
	String s=new String(ch);
	
	String s1 = "abcd";
	
	System.out.println("s:"+s);
	System.out.println("s1:"+s1);
	
	}
	
	void StringCreation() {
		
		/*
		 * String Literal,
		 * Stored in string constant pool, more memory efficient
		 *  created by using double quotes
		 */
		
		//String s="Thanks";
		String s1="Welcome";
		System.out.println("s:"+s);
		System.out.println("s1:"+s1);
		
		/*
		 * by new keyword, 
		 * stored in heap memory 
		 * var refer the obj in heap
		 */
		
		String s2=new String("Example");
		
		System.out.println("s2:"+s2);
		
		
	}
	
	
	void getByte() {
		String s1="ABCDEFG";
		byte[] by=s1.getBytes();
		System.out.println(by);
		for(int i=0;i<s1.length();i++) {
			System.out.println(by[i]);
		}
	}
	
}
