package fileInputOutputReadWrite;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteByPrintWriter_Q1 {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos=new FileOutputStream("MyFile.txt");
		PrintWriter pw=new PrintWriter(fos);
		pw.println("Name :My Name is Sohag");
		pw.println("Age: "+41);
		pw.close();

	}

}
