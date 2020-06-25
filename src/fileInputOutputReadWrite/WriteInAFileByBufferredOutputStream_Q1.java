package fileInputOutputReadWrite;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class WriteInAFileByBufferredOutputStream_Q1 {

	public static void main(String[] args) throws Exception {
		
		FileOutputStream fos=	new FileOutputStream("C:\\Users\\nafas\\Desktop\\ForCoddingPurpose\\MyFile_bos.txt");
		BufferedOutputStream bf=new BufferedOutputStream(fos);
		bf.write("My name is Sohag".getBytes());
		bf.close();
		
		

	}

}
