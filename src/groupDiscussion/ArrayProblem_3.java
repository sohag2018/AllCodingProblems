package groupDiscussion;

//import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

//Q: Read the String from a file and declare an array which size should be exact size of the String. Then put the characters of the stering
//in that array index. Print index value of the array in your console.
public class ArrayProblem_3 {

	public static void main(String[] args) throws FileNotFoundException {
		
		//File fis = new File(System.getProperty("user.dir") + "\\src\\groupDiscussion\\StringForArray");  OR
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir") + "\\src\\groupDiscussion\\StringForArray");

		Scanner sc = new Scanner(fis);

		String name = sc.nextLine();
		sc.close();
		char[] c = new char[name.length()];
		for (int i = 0; i < name.length(); i++) {
			c[i] = name.charAt(i);

			System.out.print(c[i] + " ");
		}

	}

}
