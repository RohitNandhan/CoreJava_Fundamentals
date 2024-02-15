package string;

public class StringFormatting {
	int a=0;
	
	StringFormatting(){
	String firstname="Ronan";
	
	String greetingTemplate="Hello,dear %s! Good %s!";
	
	String m="morning";
	String a="afternoon";
	String e="evening";
	
	String formattedString=String.format(greetingTemplate, firstname,m);
	
	System.out.println(formattedString);
	
	System.out.printf("you got \u20B9%d coupon !",1000);
}
	
}
