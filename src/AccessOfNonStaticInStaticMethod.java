
public class AccessOfNonStaticInStaticMethod {
	
	static int a=5; //non static variable
	int b=10; //static variable
	int c=2;
	static int d=3;
	
	//non static method:
	public void add() {
		int sum1=a+b; //static+non-static
		int sum2=a+d; //static+static 
		int sum3=b+c; //non-static + non-static
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);
				

	}
	
	
	//staric method
	public static void multiply() {
		//int result1=a*b; //static+non-static  -->not possible
		//int result2=b*c;  //non-static +non-static -->not possible
		int result3=a*d;
		//obj
		AccessOfNonStaticInStaticMethod obj=new AccessOfNonStaticInStaticMethod();
		int result4=a*obj.b;
		int result5=obj.b*obj.c;
		
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
	}
	

}
