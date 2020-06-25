
package groupDiscussion;

//Q: declare an array and put the value as mentioned {1,5,25,125,625.......}
public class ArrayProblem_7 {

	public static void main(String[] args) {

		int[] a = new int[5];

		for (int i = 0; i < 5; i++) {

			if (i < 1) {
				a[i] = 1;      
			} else

				a[i] = a[i - 1]*5;

			System.out.println(a[i]);
		}

	}
}
