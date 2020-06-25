package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;


public class Practice_2 {

	public static void main(String[] args) throws Throwable {
		String url="jdbc:oracle:thin:@localhost:152:xe";
		String userId="system";
		String password="12345";
		
		//this program update a record in the Student1 table so need values for the query
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		String name=sc.next();
		System.out.println("Enter roll");
		int roll=sc.nextInt();
		System.out.println("Enter class");
		String className=sc.next();
		sc.close();
		
		//create the query 
		String query="Insert Into Strudent1 values('"+name+"','"+roll+"','"+className+"')";
		
		//Loading the driver
		//DriverManager.registerDriver(new oracle.jdbc.oracle.OracleDriver());
		Class.forName("oracle.jdbc.driver.oracleDriver");
		//create the connection
		Connection con=DriverManager.getConnection(url,userId,password);
		//create the statement
		Statement statement=con.createStatement();
		int status=statement.executeUpdate(query);
		if(status==1) {
			System.out.println("Update successcull");
		}else {System.out.println("Update fail");}
		
		con.close();
		
		
	for (int i = 0; i < args.length; i++) {
		
	}
		
	

	}

}
