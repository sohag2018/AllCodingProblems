package arrayListProblems;

import java.util.ArrayList;

public class RemoveElement_Q1 {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer> ();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(1);
		a.add(2);
		
		//By using remove() over
		a.remove(0);
		
		
		//to remove last index value+
		//a.remove(a.size()-1);
		
	//	a.remove(new Integer(20));  //-->To remove object
		
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
		}
		
		

	}

}
