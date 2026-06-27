package demo_suma;

public class FindFirstTwoMin {

	public static void main(String[] args) {

		int[] arr = {25,41,7,81} ;
		int min1 = arr[0];
		int min2 = arr[1];
		for (int i=1; i<arr.length;i++) {
			if(min1 > arr[i]) {
				min2 = min1;
				min1 = arr[i];
			} else if(min2 > arr[i]) {
				min2 = arr[i];
			}
		}
		System.out.println(min1);
		System.out.println(min2);
	}

}





