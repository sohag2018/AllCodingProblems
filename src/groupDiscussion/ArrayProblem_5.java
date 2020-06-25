package groupDiscussion;

import java.util.Arrays;

/*Q: a[]={3,2,1,5,4} find the size of the array. declare 2nd array with the same size then put value in descending order. 
Show the pair difference ?*/

public class ArrayProblem_5 {

	public static void main(String[] args) {
	
		int a[] = {3,2,1,5,4};                              //5   1   = 4
		Arrays.sort(a);  //1,2,3,4,5
	
		int b[]= new int[a.length];
		for (int j = a.length-1; j >=0; j--) {
			for(int k=0;k<b.length;k++) {
				b[k]=a[j];
				
			}
		
		}}}
	


