package arrayProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArray_Q5 {

	public static void main(String[] args) {
		//1. traverse reverse way:
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for(int i=numbers.length-1;i>=0;i--) {
			System.out.print(numbers[i]+" ");
		}	
		
		//2. 
		
		for (int i = 0; i < numbers.length / 2; i++) {
	         int temp = numbers[i];	
	         numbers[i] = numbers[numbers.length - 1 - i];
	         numbers[numbers.length - 1 - i] = temp;
	      } 
	      System.out.println("2ns approach:");
	      for (int i = 0; i < numbers.length; i++) {
	         System.out.print(numbers[i] + " ");
	      } 
	      
	      //3
	      List list=new ArrayList(Arrays.asList(numbers));
	      Object[] a2 =list.toArray();
	      System.out.println("Reverse Array by using 3rd approach: "+Arrays.toString(a2));
	}
}
