package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Practice_1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url = "jdbc:oracle:thin:@localhost:152:xe";
		String userId = "system";
		String password = "123456";
		
		//for post request we need data to insert into table
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Student name");
		String name=scanner.next();
		System.out.println("Enter the roll Number");
		int roll=scanner.nextInt();
		System.out.println("Enter the class Name");
		String className=scanner.next();
		
		
		//Create sql querry
		
		String querry="INSERT INTO Students1 Values('"+name+"','"+roll+"','"+className+"')";
		
		
		//Loading the driver
		//DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
		Class.forName("oracle.jdbc.oracleDriver");
		//create the connections
		Connection con=DriverManager.getConnection(url,userId,password);
		//create the statement
		Statement st=con.createStatement();
		int status=st.executeUpdate(querry);
		
		if(status==1) {
			System.out.println("update successfull");
		}else {
			System.out.println("update failed");
		}
		//closing connection
		con.close();

	}

}
