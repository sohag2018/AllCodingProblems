package arrayListProblems;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Practice_RemoveDuplicate {

	public static void main(String[] args) {
		ArrayList aList= new ArrayList();
		aList.add(1);
		aList.add(5);
		aList.add(5);
		aList.add(10);
		aList.add(15);
		aList.add(20);
		aList.add(10);
		
		System.out.println(aList); //[1, 5, 5, 10]
		
		
		//Let's remove duplicates
		
		System.out.println("# 1.-----------------------");
		//put aList value in a new unique list
		
		ArrayList list=new ArrayList();
		list.add(aList.get(0));
		for(int i=1; i<aList.size();i++) {
			if((aList.get(i))!=aList.get(i-1)) {
			list.add(aList.get(i));
		}}
		
		System.out.println(list);
		
		//But it will compare only with prev value. will not work if duplicate is somewhere else
		
		//Let's do some other way we know LinkedHashSet doesnt allow duplicate
		System.out.println("# 2.-----------------------");
		LinkedHashSet l=new LinkedHashSet(aList);
		ArrayList list1=new ArrayList(l);
		System.out.println(list1);
		
	}

}
