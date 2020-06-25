package jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

//Class.forName("oracle.jdbc.driver.OracleDriver");
//Driver myDriver = new oracle.jdbc.driver.OracleDriver();
//DriverManager.registerDriver( myDriver );

public class Practice_3 {

	public static void main(String[] args) throws ClassNotFoundException, Throwable {
		String url="jdbc:oracle:thin:@localhost:152:xe";
		String userId="system";
		String password="12345";
		
		//get input from user for creating update query
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		String name=sc.next();
		System.out.println("Enter roll");
		int roll=sc.nextInt();
		System.out.println("Enter class");
		String className=sc.next();
		
		String query="Insert Into Student1 Values('"+name+"','"+roll+"','"+className+"')";
		
		//Loading Driver
		
//		Driver myDriver=new oracle.jdbc.driver.OracleDriver();
//		DriverManager.registerDriver(myDriver);
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//create Connection
		Connection connection=DriverManager.getConnection(url,userId,password);
		
        //create statement
		
		Statement statement=connection.createStatement();
		int status=statement.executeUpdate(query);
		
		if (status==1) {
			System.out.println("Update Successfull");
			
			
		} else {
			System.out.println("Update Fail");
		}
	}

}
