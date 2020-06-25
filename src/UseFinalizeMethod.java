//import java.util.GregorianCalendar;
//
//public class UseFinalizeMethod extends GregorianCalendar {
//	//java.lang.Object.finalize()
//	//A subclass overrides the finalize method to dispose of system resources or to perform other cleanup.
//	
//
//	public static void main(String[] args) {
//	      try {
//	         // create a new ObjectDemo object
//	    	  UseFinalizeMethod cal = new UseFinalizeMethod();
//
//	         //before calling finalize()
//	         System.out.println("" + cal.getTime());
//             
//	         //calling finalize()
//	         cal.finalize();
//	         
//	        
//	       //after calling finalize()
//	         System.out.println("" + cal.getTime());
//
//	      } catch (Throwable ex) {
//	         ex.printStackTrace();
//	      }
//	   }
//
//}
