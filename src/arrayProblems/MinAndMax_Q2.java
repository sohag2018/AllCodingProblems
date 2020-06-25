package arrayProblems;

import java.util.Arrays;
import java.util.Collections;

public class MinAndMax_Q2 {
	// 1: Using min() and max() of Collections class and asList() from Arrays
	// must be Integer[] not int[]
	public static void main(String[] args) {
		Integer[] numbers = { 8, 2, 7, 1, 4, 9, 5 };
		int min = (int) Collections.min(Arrays.asList(numbers));
		int max = (int) Collections.max(Arrays.asList(numbers));
		
		System.out.println("Min number: " + min);
		System.out.println("Max number: " + max);

		// 2: sort() then 0 index and last index
		int array[] = { 8, 2, 7, 1, 4, 9, 5 };
		Arrays.sort(array);
		System.out.println("min number: " + array[0]);
		System.out.println("max number: " + array[array.length - 1]);

		// 3: using for loop and temp variables
		int minNumber = array[0];
		int mxaNumber = array[0];
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] > array[0])
				minNumber = array[0];
				mxaNumber = array[i];
		}
		System.out.println("min number: " + minNumber);
		System.out.println("max number: " + mxaNumber);

	}
}
