package arrayListProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate_Q2 {

	public static void main(String[] args) {
		List<Integer> a = new ArrayList<Integer> ();
		a.add(10);
		a.add(20);
		a.add(20);
		a.add(1);
		a.add(2);
		
		System.out.println(a);
		//1. get another Arraylist put unique value
		List<Integer> a3 = new ArrayList<Integer> ();
		a3.add(a.get(0));//to put 1st index value
		for(int i=1;i<a.size();i++) {
			if(a.get(i)!=a.get(i-1)) {
				a3.add(a.get(i));
			}
			
		}
		
		System.out.println(a3);
		
		
		//2.Using Java 8 Stream.distinct()
		System.out.println(a.stream().distinct().collect(Collectors.toList()));//
		
		
		
		//3: we can remove duplicate by using LinkedHashSet // doesnt allow duplicates
		LinkedHashSet<Integer> hashSet = new LinkedHashSet<>(a);
		
		
		ArrayList<Integer> a1=new ArrayList<Integer>(hashSet);
		System.out.println(a1);
		
		
		

	}
	
	

}
