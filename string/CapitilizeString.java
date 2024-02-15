package string;

public class CapitilizeString {

	
	/** 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="hai hello go and there. oh bye bye";
		usingString(s1);
		usingArray(s1);
		
	}
	
	static void usingArray(String s1) {
		char[] arr=s1.toCharArray();
		for(int i=0;i<arr.length;i++) {
			//System.out.println(arr[i]);
			if(i==0 || arr[i-1]==' '|| arr[i-1]=='.') {
				
				arr[i]=(char)Character.toUpperCase(arr[i]);
				//System.out.println(arr[i]);
			}
		}
		
		System.out.println(new String(arr));
		
	}
	
	static void usingString(String s1) {
			
			String s2=new String();
			//byte[] by=s1.getBytes();
			//System.out.println(by.toString());
			for(int i=0;i<s1.length();i++) {
				
				if(i==0 || s1.charAt(i-1)==' ' || s1.charAt(i-1)=='.') {
					if(s1.charAt(i)>='a' && s1.charAt(i)<='z') {
						
					s2+=toUppercases(s1.charAt(i));
				}
				}else
				s2+=s1.charAt(i);
				
			}
			System.out.println(s2);
	//
	
	
	}
		static char toUppercases(char a) {
			
			return (char)(a-32);
			
		}

}
