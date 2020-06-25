package groupDiscussion;


//Q: Declare an array of 10 index size and put the index value 1-10. Find out the first 3 odd value total. //1+3+5=9

public class ArrayProblem_4 {

	public static void main(String[] args) {
		int array[] =new int[10];
		int sum=0;
		int count=0;
		for (int i = 0; i < array.length; i++) {
			array[i]=i+1;
			
				}
			for (int i = 0; i < array.length; i++) {
				
				if ((array[i]%2)!=0) {
					count++;
					sum=sum+array[i];
					if (count==3) {
						System.out.println("first 3 odd value total is: "+sum);
					}
					
				}
			}
			
		}		

	}


