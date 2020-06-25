package fileInputOutputReadWrite;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadByFileReader {
	public static void main(String[] args) throws IOException {
		/*File file=new File("C:\\Users\\nafas\\Desktop\\New_Workspace_Eclipse\\allCoddingProblems\\src\\fileInputOutputReadWrite\\Questions.txt");
		  FileReader fr=new FileReader(file);		
		*/
		                 //------------OR---------------------
		
		FileReader fr=new FileReader("C:\\Users\\nafas\\Desktop\\New_Workspace_Eclipse\\allCoddingProblems\\src\\fileInputOutputReadWrite\\Questions.txt");
		int i;
	    while((i=fr.read())!=-1) {
	    	System.out.print((char)i);
	    }
	    
	    fr.close();
        
        
		
		

	}

}
