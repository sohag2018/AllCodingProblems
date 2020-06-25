package arrayProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MeargingTwoArray_Q4 {

	public static void main(String[] args) {

		// 1. By converting array-->list, then put in Arraylist, use addAll() and finaly
		// convert to Array which returns Object[]
		String a[] = { "Tofayel", "Monir", "Sharif" };
		String b[] = { "Sohag", "Lobid", "Orfat" };
		List list = new ArrayList(Arrays.asList(a));
		list.addAll(Arrays.asList(b));
		Object[] c = list.toArray();

		System.out.println(Arrays.toString(c));

		// 2. By having 3rd array with sum of two given array length  then, putting value in it.

		int[] a1 = { 5, 10, 15 };
		int[] b1 = { 20, 25 };
		int[] c1 = new int[a.length + b.length]; //To determine the length of the merged array -->total 5 indexes
		int count = 0;
        //Putting []a1 value in []c -->value[5],[10],[15]
		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
			count++; //to confirm up to what index we used for []a -->index[0],[1],[2]
		}
		 //Putting []b1 value in []c-->value[20],[25]
		for (int j = 0; j < b.length; j++) {
			c[count++] = b[j]; //we have -->index [3],[4]
		}
		
		//[]c1 is ready to print
		for (int i = 0; i < c.length; i++)
			System.out.print(c[i] + " ");
		

	}

}
