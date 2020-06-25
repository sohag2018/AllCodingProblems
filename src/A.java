
public class A {
	int num1;
	static int num2;	
	
	//use static variable in non-static mehod:
	void nonStatic() {
		//int a=A.num2=5; or we dont need to use class name . static belongs to the class itself
		num2=9;
		System.out.println(num2);	
	}
	
     //use static and non-static variable in static method:
	public static void main(String[] args) {
		
		//let's create two obj of A class:
		A a1=new A();
		A a2=new A();	
		a1.nonStatic(); //call nonStatic()-->print current value of static variable before updat
		a2.nonStatic(); //call nonStatic()-->print current value of static variable before updat
		
		//let's put different value for num1 for different obj
		a1.num1=5;
		a2.num1=10;
		
		
		//we don't need assign value because value will be shared in every obj
		// but if we want to do following way it will just update the value and applicable for every obj
		a1.num2=10;
		a2.num2=11;

		//we are in static method. Let's print the value:
		
	    //non-static variable:
		//System.out.println(num1); //didnt use obj,so which value ????  
	    System.out.println(a1.num1); //5
	    System.out.println(a2.num1); //10
	    
	    //static variable:  
	    System.out.println(num2); //-->11: because last value is 11
	    System.out.println(a1.num2);//we don't need obj to call-->11: because last value is 11
	    System.out.println(a2.num2);//we don't need obj to call-->11: because last value is 11

       /* Note:
        * -->for non-static variable we need obj otherwise which obj variable value will be shown??
        * -->Separate obj can assign seperate value in non-static variable.
        * -->  For static variable same value will be shared for every obj
        *   --> If we try to assign value in different obj  last will assigned value will be shared for every obj (dont need) 
        	--
	    */
	}

}
