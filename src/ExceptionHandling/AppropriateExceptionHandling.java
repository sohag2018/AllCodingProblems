package ExceptionHandling;
//exception is thrown how the runTime system searches the call stack to find appropriate exception handler. 

public class AppropriateExceptionHandling {

	    // Appropriate Exception handler is not found within this method. 
	    static int divideByZero(int a, int b){            
	        int i = a/b;  // this statement will cause ArithmeticException(/ by zero)          
	        return i; 
	    } 
	      
	    // The runTime System searches the appropriate Exception handler 
	    // in this method also but couldn't have found. So looking forward 
	    // on the call stack. 
	    static int computeDivision(int a, int b) { 	          
	        int res =0; 	          
	        try{ 
	          res = divideByZero(a,b); 
	        }catch(NumberFormatException ex){ // doesn't matches with ArithmeticException 
	           System.out.println("NumberFormatException is occured");  
	        } 
	        return res; 
	    } 
	      
	    // In this method found appropriate Exception handler. 
	    // i.e. matching catch block. 
	    public static void main(String args[]){ 	          
	        int a = 1; 
	        int b = 0; 	          
	        try{ 	        
	            int i = computeDivision(a,b); 
	          
	        }           
	        
	        catch(ArithmeticException ex) {// matching ArithmeticException 	       
	            
	            System.out.println(ex.getMessage()); // getMessage will print description of exception(here / by zero) 
	        } 
	    } 

}
