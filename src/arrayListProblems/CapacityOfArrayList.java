package arrayListProblems;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class CapacityOfArrayList {

	public static void main(String[] args) throws Throwable {
		ArrayList<Integer> list1 = new ArrayList<Integer>();  //Constructs an empty list with an initial capacity of ten.
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		System.out.println("1. Initial Capacity: "+getArrayListCapacity(list1)); //----10
		//list1.ensureCapacity(12);  --->to make it 12
		//System.out.println("1. Initial Capacity: "+getArrayListCapacity(list1));  ---12
		
					
        //list1.trimToSize();//to make it current size --->5
      //System.out.println("1. Initial Capacity: "+getArrayListCapacity(list1));  //---5
        
        ArrayList<Integer> list2 = new ArrayList<Integer>(20);
        System.out.println("2. Initial Capacity: "+getArrayListCapacity(list2));
        
        ArrayList<Integer> list3 = new ArrayList<Integer>(list1);
        System.out.println("2. Initial Capacity: "+getArrayListCapacity(list3)); //----->5 because list1 size is 5 (not initial capacity of list1)
	}
private	static int getArrayListCapacity(ArrayList<Integer> list) throws Exception{
        
        //get the elementData field from ArrayList class
        Field arrayField = ArrayList.class.getDeclaredField("elementData");
        
        arrayField.setAccessible(true);
        
        //now get the elementData Object array from our list
        Object[] internalArray = (Object[])arrayField.get(list);
        
        //Internal array length is the ArrayList capacity!
        return internalArray.length;
    }

}
