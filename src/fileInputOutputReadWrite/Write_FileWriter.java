package fileInputOutputReadWrite;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Write_FileWriter {

	public static void main(String[] args) throws Throwable {
		File file=new File("C:\\Users\\nafas\\Desktop\\New_Workspace_Eclipse\\allCoddingProblems\\src\\fileInputOutputReadWrite\\File.txt");
		FileWriter  fr=new FileWriter(file);
		
		//-------------OR--------------------------
		
		//FileWriter  fr=new FileWriter("C:\\Users\\nafas\\Desktop\\New_Workspace_Eclipse\\allCoddingProblems\\src\\fileInputOutputReadWrite\\File.txt");
		
		fr.write("Sohag"+"\n");
		fr.write("Bangladesh", 0, 5);
		
		fr.close();
		
		
		
	}

}
