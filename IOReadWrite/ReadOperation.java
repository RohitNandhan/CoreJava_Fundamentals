package IOReadWrite;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;

public class ReadOperation {
	
	public static void main(String[] args) {
		char[] array=new char[10];
		//String array=new String();
		try {
			Reader read=new FileReader("file.txt");
			//System.out.println(read.read(array));
			//read.
			read.read(array);
			System.out.println(array);
		}catch (Exception e) {
			e.getStackTrace();
		}
	}

}
