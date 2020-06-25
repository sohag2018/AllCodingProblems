package SerializationAndDeserialization;
/*What I am doing?---->converting  file format into obj 
-connect file where binary code of obj is saved--> by FileInputStream
-read obj by ObjectInputStream 
 */
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


public class DeSerialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		FileInputStream fis=new FileInputStream("C:\\Users\\nafas\\Desktop\\New_Workspace_Eclipse\\allCoddingProblems\\Serialization.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		//read the file and convert into Object form -->need to type cast (Support) as our original class was Support
		Support s1=(Support)ois.readObject();
		
		System.out.println("Name: "+s1.name+" "+"Age: "+s1.city);
		
		ois.close();
		
		//
		

	}

}
