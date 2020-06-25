package fileInputOutputReadWrite;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class P_Write_PrintWriter {
	public static void main(String []args) throws Throwable {

	//File file=new File("C:\\Users\\nafas\\Desktop\\New_Workspace_Eclipse\\allCoddingProblems\\src\\fileInputOutputReadWrite\\File.txt");
	
	//----------------OR--------------
	
	FileOutputStream file=new FileOutputStream("C:/Users/nafas/Desktop/New_Workspace_Eclipse/allCoddingProblems/src/fileInputOutputReadWrite/File.txt");
	
	PrintWriter pw=new PrintWriter(file);
	pw.println("My name is Sohag");
	pw.println(41);
	pw.println("NY");
	pw.write("Welcome"+"\n");
	pw.write("Sharif",0,5);
	
	
	pw.close();
	}
	
	
}
