package fileInputOutputReadWrite;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class P_1_read_Scanner {

	public static void main(String[] args) throws FileNotFoundException {
		/*FileInputStream fis = new FileInputStream("C:\\Users\\nafas\\Desktop\\New_Workspace_Eclipse\\allCoddingProblems\\MyFile.txt");
		  Scanner sc=new Scanner(fis);*/
		//----------OR-------------------
		
		File file=new File("C:\\Users\\nafas\\Desktop\\New_Workspace_Eclipse\\allCoddingProblems\\MyFile.txt");
		Scanner sc=new Scanner(file);
		
		//System.out.println(sc.next());//it will print only Name--->first word of the first line
		//System.out.println(sc.nextLine());//it will print only first line
		
		while (sc.hasNextLine()) {
			System.out.println(sc.nextLine());
			
		}
		
		sc.close();
		

	}

}
