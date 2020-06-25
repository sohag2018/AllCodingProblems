package arrayProblems;

import java.util.Arrays;

// What I am doing?---> sorting a given array 

public class Sorting_Q1 {

	public static void main(String[] args) {
		// 1) sort () 
		int array[] = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
		Arrays.sort(array);
		for (int i = 0; i < array.length; i++) {
		
			System.out.print(array[i]+" ");
		}
		// to print sorted array separated with comma(,)
		for (int i = 0; i < array.length; i++) {
			if (i != 0) {
				System.out.print(", ");
			}
			System.out.print(array[i]);
		}
		
		 //2 Bauble sorting concept:-> Using 2 for loop and 3rd variable concept to swap the value
			 int arr[] = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };  
		     int temp = 0;
		      for(int i = 0; i < arr.length; i++) {
		         for(int j=1; j < (arr.length-i); j++) {
		            if(arr[j-1] > arr[j]) { 
		               temp = arr[j-1]; //using as 3rd variable
		               arr[j-1] = arr[j];
		               arr[j] = temp;
		            } 
		         } 
		      } 
		      System.out.println("Array After Bubble Sort");  
		      for(int i = 0; i < arr.length; i++) {
		         System.out.print(arr[i] + " ");
		      } 
		   }

	}
