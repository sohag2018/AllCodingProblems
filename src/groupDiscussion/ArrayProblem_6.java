
package groupDiscussion;

//Q: declare an array and put the value as mentioned {1 2 4 8 16 32 64 ........}
public class ArrayProblem_6 {

	public static void main(String[] args) {

		int[] a = new int[5];

		for (int i = 0; i < 5; i++) {
			
			if (i<1) {
				a[i]=400;
			} else {
				a[i]=a[i-1]/2;

			}
			
			
			
	
			System.out.println(a[i]);
		}

	}
}
