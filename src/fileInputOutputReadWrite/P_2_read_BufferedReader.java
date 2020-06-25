package fileInputOutputReadWrite;

import java.io.BufferedReader;
import java.io.FileReader;

public class P_2_read_BufferedReader {

	public static void main(String[] args) throws Throwable {
	
		//File file=new File("C:\\Users\\nafas\\Desktop\\New_Workspace_Eclipse\\allCoddingProblems\\MyFile.txt");
		//FileReader fr=new FileReader(file);
		
		                  //--------OR--------------------
		
		
		FileReader fr=new FileReader("C:\\Users\\nafas\\Desktop\\New_Workspace_Eclipse\\allCoddingProblems\\MyFile.txt");
		
		BufferedReader bf=new BufferedReader(fr);  //it will accept File obj directly  or FileInputStream -->no way
		String line;
		while ((line=bf.readLine())!=null) {
			System.out.println(line);
		}
		bf.close();
		
		
	}

}
