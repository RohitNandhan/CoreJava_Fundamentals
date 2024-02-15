package IOReadWrite;

import java.io.PrintWriter;
import java.io.StringWriter;

public class StringWriters {
	public static void main(String[] args) {
		
	
	
	String data = "This is the original data";

//	StringWriter sw=new StringWriter();
//	sw.write(data);
	StringWriter output = new StringWriter();

    // Writes data to the string buffer
    output.write(data);
    
    PrintWriter pr=new PrintWriter(output);
    pr.print(data);
pr.printf("hai %d",15);
pr.println("hai");

	System.out.println(output.toString());
}
}
