package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Practice_42620 {
	public static void main(String[]args) throws Throwable {
		//Update query
		
		String url="jdbc:oracle:thin:@localhost:152:xe";
		String user="system";
		String password="12345";
		
		//get input to create the update query
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		String name=sc.next();
		System.out.println("Enter roll");
		int roll=sc.nextInt();
		System.out.println("Enter class");
		String className=sc.next();
		sc.close();
		
		//create the query:
		String querry="Insert Into Sturdent1 Values('"+name+"','"+roll+"','"+className+"')";
		
		//loading driver: 
		
		//DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());  OR
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//get connection
		Connection con=DriverManager.getConnection(url,user,password);
		
		//create statement
		Statement statement=con.createStatement();
		int status=statement.executeUpdate(querry);
		
		if (status==1) {
			System.out.println("update successful");
		} else {
			System.out.println("update unsuccessful");
			

		}
		//closing connection:
		con.close();
		
		
		
		
		
		}

}

