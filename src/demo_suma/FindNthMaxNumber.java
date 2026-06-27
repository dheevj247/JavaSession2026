package demo_suma;

public class FindNthMaxNumber {

	public static void main(String[] args) {

		int[] arr = {25,41,7,81,65,800} ;
		int n = 0;
		int max1 = arr[0];
		int max2 = arr[1];
		for (int i=1; i<arr.length;i++) {
			if(max1 < arr[i]) {
				max2 = max1;
				max1 = arr[i];
			} else if(max2 < arr[i]) {
				max2 = arr[i];
			}
		}
		System.out.println(max1);
		System.out.println(max2);
	}

}



