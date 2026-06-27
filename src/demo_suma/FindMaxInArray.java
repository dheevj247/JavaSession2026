package demo_suma;

public class FindMaxInArray {

	public static void main(String[] args) {
		int[] arr = {25,41,7,81} ;
		int max = arr[0];
		int index = 0;
		for (int i=1; i<arr.length;i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}
}
