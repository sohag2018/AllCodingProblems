package fileInputOutputReadWrite;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadByBufferReader {

	public static void main(String[] args) throws IOException {
		File file=new File("C:\\Users\\nafas\\Desktop\\New_Workspace_Eclipse\\allCoddingProblems\\src\\fileInputOutputReadWrite\\Questions.txt");
		FileReader fr=new FileReader(file); //we could directly pass the file path here
		BufferedReader br=new BufferedReader(fr);
		String line;
		while((line=br.readLine())!=null) {
			System.out.println(line);
		}
		br.close();
        
		
		

	}
}

