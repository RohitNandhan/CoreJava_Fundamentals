package Collections.ArrayList;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

class Program1 {
	// Serilization and Deserization 
	
	Program1(){
		
		ArrayList<String> al=new ArrayList<>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ajay");
		
		serializationDeserialization(al);
		
	}


@SuppressWarnings("rawtypes")

private void serializationDeserialization( ArrayList al) {
		// TODO Auto-generated method stub
		try {
			//serialization
			
			FileOutputStream fos=new FileOutputStream("file");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			
			oos.writeObject(al);
			fos.close();
			oos.close();
			
			//deserialization
			
			FileInputStream fis=new FileInputStream("file");
			ObjectInputStream ois=new ObjectInputStream(fis);
			
			ArrayList lst=(ArrayList) ois.readObject();
			System.out.println(lst);
		}catch(Exception e) {
			System.out.println(e);
			
		}
		
	}
}
