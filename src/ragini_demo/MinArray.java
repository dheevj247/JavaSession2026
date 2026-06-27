package ragini_demo;

public class MinArray {

	public static void main(String[] args) {
		int[] arr = {25,41,7,81};
		int min = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println(min);		
	}

	

}
