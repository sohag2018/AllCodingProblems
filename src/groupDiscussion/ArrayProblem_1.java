package groupDiscussion;

//Q: Declare an array with the size (total index) of your first name's character total and store those characters respectively in that array. Finally print all index value in console


public class ArrayProblem_1 {

	public static void main(String[] args) {
		
	String	name="Muhammad";
		char array[]=new char[name.length()];
		for(int i=0;i<array.length;i++) {
			array[i]=name.charAt(i);
			
			
			
			System.out.print(array[i]+" ");
		}
		
		
		System.out.println("\n"+"Char at 0th index:"+array[0]);

	}

}
