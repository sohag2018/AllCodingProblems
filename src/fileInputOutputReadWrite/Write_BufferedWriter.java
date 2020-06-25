package fileInputOutputReadWrite;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Write_BufferedWriter {

	public static void main(String[] args) throws Throwable {
		FileWriter  fr=new FileWriter("C:\\Users\\nafas\\Desktop\\New_Workspace_Eclipse\\allCoddingProblems\\src\\fileInputOutputReadWrite\\File.txt");
		fr.write("Sohag"+"\n");
		fr.write("Bangladesh", 0, 5);
		
		fr.close();
		
		
		/*BufferedWriter bw=new BufferedWriter(fr);
		bw.write("Muhammad");
		bw.write(50);
		bw.write("\n"+"Bangladesh", 0, 5);
		
		bw.close();*/
	}

}
