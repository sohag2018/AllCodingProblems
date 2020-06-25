package groupDiscussion;

import java.util.Arrays;

public class MissingNumber {

	//Q: You have an integer array which contains 1-5 but there is a missing number. Do your program to find it out.
	//5,6,7,8,9=
	
	public static int findMissingNumber(int a []) {
		int len=a.length;
		int value=(len+1)*(len+2)/2;
		for(int i=0;i<len;i++) {
			value-=a[i];
		}
		return value;
	}
	
	
	
	public static void main(String[] args) { 
		
		int a[]= {1,2,5,4}; 
		System.out.println("Missing Number:"+findMissingNumber(a));
		
	}
		

	}


