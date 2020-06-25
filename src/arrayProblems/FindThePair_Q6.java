package arrayProblems;

import java.util.Arrays;

public class FindThePair_Q6 {

	public static void main(String[] args) {
		
		//approach 1:
		int arr[]= {8,6,4,3,1,2,5,7,9};
		int sum=10;
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==sum) {
					System.out.println("Pair Found at index: "+i+" and "+j+ ", Pairs are: "+arr[i]+" & "+arr[j]);
					//return;
				}
			}
		}
		
		System.out.println("-----------2nd Approach-----------");
		
		//approach 2: After sorting, without inner loop, 
		
		Arrays.sort(arr);
		int lowIndex=0;
		int highestIndex=arr.length-1;
		
		while(lowIndex<highestIndex) {
			if(arr[lowIndex]+arr[highestIndex]==sum) {
				System.out.println("Pair Found");
				return;
			}
			
			else if(arr[lowIndex]+arr[highestIndex]<sum) {
				lowIndex++;
			}else {
				highestIndex--;
			}
		}
		

	}

}
