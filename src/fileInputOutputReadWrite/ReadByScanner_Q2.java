package fileInputOutputReadWrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadByScanner_Q2 {

	public static void main(String[] args) throws FileNotFoundException {
		//FileInputStream fis=new FileInputStream("C:\\Users\\nafas\\Desktop\\New_Workspace_Eclipse\\allCoddingProblems\\src\\fileInputOutputReadWrite\\Questions.txt");
		File fis=new File("C:\\Users\\nafas\\Desktop\\New_Workspace_Eclipse\\allCoddingProblems\\src\\fileInputOutputReadWrite\\Questions.txt");
		Scanner sc=new Scanner(fis);
		while(sc.hasNext()) {
			System.out.println(sc.nextLine());
		}
		sc.close();
		

	}
	

}

