package arrayListProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReverseArrayList {

	public static void main(String[] args) {
	ArrayList list=new ArrayList();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
	
		for(int i=0;i<list.size();i++) System.out.println(list.get(i)); //12345
		
		//System.out.println(list); //[1, 2, 3, 4, 5] //print the list
		
		//but i want to print reverse way [5, 4, 3, 2, 1]  or 54321
		
		Collections.reverse(list);
		for(int i=0;i<list.size();i++) System.out.println(list.get(i)); //12345
		
		//Or I can traverse from the last index but before Collections.reverse(list);
		//for(int i=list.size()-1;i>=0;i--) System.out.println(list.get(i));
		
		//What about array?   Not possible directly because this method accepts a list as an argument so we can convert array as list
		
		
	   
	
		
		

	}}

