package ExceptionHandling;

public class ExceptionHandling1 {
	int a=10;
	int b=0;
	
      //method that creates the exception
	  public void divideByZero(){  
		  try {
	        int i = a/b;  // this statement will cause ArithmeticException(/ by zero)          
	        System.out.println(i);
		  }catch (ArithmeticException e){
			  System.out.println(e.getMessage());
			  System.out.println(e.getStackTrace());
			  System.out.println(e);
			  System.out.println("divided by zero is not possible---customized message");
		  }

	    } 
	
	public static void main(String[] args) {
		
		ExceptionHandling1 obj =new ExceptionHandling1();
		obj.divideByZero();
		
	}

}
