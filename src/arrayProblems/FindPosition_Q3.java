package arrayProblems;

import java.util.Arrays;

// What I am doing?---> find the index number of 8 by using different approaches

public class FindPosition_Q3 {

	public static void main(String[] args) {
		// 1)binarySearch () method
		int array[] = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 5 };
		// position of 2 in sorted array:---> we must sort it for binary search //-9, -7, -3, -2, 0, 2, 4, 5, 6, 8
		//Arrays.sort(array);
		//
		int index=Arrays.binarySearch(array, 5);
		System.out.print("Found Index Number By # binarySearch-----> ");
		System.out.println(index);
		
		
		//2) Linear Search
	      for (int i = 0; i < array.length; i++) {
	         if (array[i] == 5) {
	        	 System.out.print("Found Index Number By # Linear Search-----> ");
	            System.out.println(i);
	           
	         } 
	      } 
	}
}
