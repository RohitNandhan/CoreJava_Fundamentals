package IOReadWrite;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SearchFilesByExtension {
	public static void main(String[] args) throws IOException {
		System.out.println(getNumberOfFilesWithExtension(null, "txt"));
	}
	    public static long getNumberOfFilesWithExtension(Path pathToStartSearch, String extension)
	    throws IOException{
	    	pathToStartSearch=Paths.get("C:\\Rohit P\\UPSKILLING\\JAVA SE OCJP\\TestCode\\NoOfFiles");
	    	
	    	long fileList=Files.list(pathToStartSearch).filter(Files::isRegularFile).filter(file->file.getFileName().endsWith(extension)).count();
			return fileList;
	    
	        
	        
	        
	        
		}
	

}
