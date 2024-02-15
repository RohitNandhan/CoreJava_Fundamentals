package string;

public class StringImmutabilty {

		public StringImmutabilty() {
			// TODO Auto-generated constructor stub
			
			String s1="Hello";
			String s2=new String("Hello");
			String s3=s2.intern();
			
			System.out.println(s1==s3);
			
			
			
		}
}
