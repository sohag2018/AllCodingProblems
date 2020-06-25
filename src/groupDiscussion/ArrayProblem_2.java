
package groupDiscussion;

//Q: declare an array and put the value as mentioned {1,1,2,3,5,8,13,.......}   
public class ArrayProblem_2 {

	public static void main(String[] args) {

		int[] a = new int[10];

		for (int i = 0; i < 10; i++) {

			if (i < 2) {
				a[i] = 1;      
			} else

				a[i] = a[i - 1] + a[i - 2];

			System.out.println(a[i]);
		}

	}
}
