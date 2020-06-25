package arrayListProblems;
import java.lang.reflect.Field;
/*ArrayList is dynamic. How? What is its initial capacity? How does it set?
 * 
 * It depends. What? Yes it depends how do you create the obj of ArrayList.
 * Wow! Can you explain little bit? Sure.
 * Normally we create the obj of ArrayList following way:
 * ArrayList list1=new ArrayList()--->means we are using default constructor
 * When we use default constructor it creates an empty list with initial capacity 10
 * Hmm ! But we knew it. Let's explore more.
 * If we created an object this way--> ArrayList list2=new ArrayList(12)  then what would happen? 
 * Answer is initial capacity would be 12--> means we are using parameterized constructor where we supply the 12 for creating capacity
 * Again if we used this way--> ArrayList list3=new Arraylist(list1)---->then capacity would be the size of list1
 * if list1 size is 5 then 5 if 12 then 12
 * Don't believe me let's check out.
  */
import java.util.ArrayList;


public class Practice_CapacityOfArrayList {

	public static void main(String[] args) throws Throwable, Throwable {
		
		
		ArrayList<Integer> list1=new ArrayList<Integer>(20); //using default constructor means capacity is 10
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		ArrayList list2=new ArrayList(list1);
		Field arrayField =ArrayList.class.getDeclaredField("elementData");//get the elementData field
		arrayField.setAccessible(true);//get access to avoid illigalAccessException
		Object[] internalArray=(Object[])arrayField.get(list2);//type cast with Object type array to store in an Obj type array 
		System.out.println(internalArray.length);
		
        //to check further capacity change the constructor and do the same way or use a method and call the method by passing parameter
	}
	
//	//creating a method to find the initial capacity of ArrayList
//	private static int getArrayListCapacity(ArrayList<Integer> list) throws Throwable, Throwable {
//		//get the elementData field from ArrayList class
//		Field arrayField =ArrayList.class.getDeclaredField("elementData");
//		arrayField.setAccessible(true);
//		//now get the elementData Object array from out list
//		Object[] internalArray=(Object[])arrayField.get(list);
//		//Internal array length is the arrayList capacity
//		return internalArray.length;
//	}
	
	

}
