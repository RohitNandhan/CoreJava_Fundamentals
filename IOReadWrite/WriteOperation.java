package IOReadWrite;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;

public class WriteOperation {
	public static void main(String[] args) {
		String data="Hello World";
		
		try {
			Writer output=new FileWriter("file.txt");
			
			output.write(data);
			
			output.close();
			
		}catch (Exception e) {
			e.getStackTrace();
		}
	}

}
