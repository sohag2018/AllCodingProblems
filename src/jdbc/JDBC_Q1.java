package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class JDBC_Q1 {

	public static void main(String[] args) throws Throwable {
		
		String url="jdbc:oracle:thin:@localhost:152:xe";  //oracle->database  thin-->driver, @localhost--IP address where databse stored, 152-->port, xe-->service provider
		String user="system";
		String pass="12345";
		
		//creating data by using scanner class
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name"); 
		String name=sc.next();
		System.out.println("Enter roll");
		int roll=sc.nextInt();
		System.out.println("Enter className");
		String clsssName=sc.next();
		
		//creating the update sql query:
		String query="Insert Into Strudents1 Vlaues('"+name+"','"+roll+"','"+clsssName+"')";
		
		//Loading driver
		//DriverManager.registerDriver(new oracle.jdbc.oracle.OracleDriver());   //facing problem
		Class.forName("oracle.jdbc.driver.oracleDriver"); 
		 //create connection
		Connection con=DriverManager.getConnection(url,user,pass);
		//create a statement
		Statement st=con.createStatement();
		//execute query
		int status=st.executeUpdate(query);
		//print status
		if(status==1) {
			System.out.println("successfull");
		}else {
			System.out.println("fail");
		}
		//closing connection
		con.close();
		
	}

}
