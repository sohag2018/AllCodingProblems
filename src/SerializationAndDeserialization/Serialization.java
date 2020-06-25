package SerializationAndDeserialization;

/*What I am doing?---->converting obj of Support class into file format (serialization)
  -connect to file where binary code of our obj will be saved--> by FileOutputStream in Serialization class
  -write obj of Support class by ObjectOuputStream in Serialization class
  Process: 
           4. connect file with FileOutputStream 
           5. write obj in file by ObjectOutputStream  
           6. run the program        

*/

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialization {

	public static void main(String[] args) throws IOException {
		//obj creation of Support class
		
		FileOutputStream fos=new FileOutputStream("Serialization.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(new Support());
		oos.close();
		
		//If you run you can see the Serialization.txt in the project with binary code-->means object converted into File format
		//this process is called serialization 
		
		

	}

}
