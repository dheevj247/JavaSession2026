package demo_suma;

public class ArrayFactorialProgram {

	public static void main(String[] args) {
		int[] arr = {25,41,7,8} ;
		int fact = 1;
		for (int i=0 ; i<arr.length; i++) {
			fact = fact * arr[i];	
		}
		System.out.println(fact);
	}

}
