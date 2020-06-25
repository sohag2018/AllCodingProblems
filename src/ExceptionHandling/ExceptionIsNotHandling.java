package ExceptionHandling;

import java.util.Scanner;

public class ExceptionIsNotHandling {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
        System.out.println("Enter String to convert:");
		//String input=sc.nextLine();
		int input=Integer.parseInt(sc.nextLine());
		
		System.out.println("Your converted int is:"+input);

	}

}
