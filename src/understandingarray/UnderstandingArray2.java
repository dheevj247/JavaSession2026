package understandingarray;

public class UnderstandingArray2 {
	public static void main(String[] args) {
		//method 1: to create an array
		int[] arr = { 1, 2, 3, 4, 5 };
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		
		//method 2: to create an array , here 5 is the size of the array
		//we are creating a new empty array of size 5.
		int[] arr2 = new int[5];
		arr2[0] = 10;
		arr2[1] = 20;
		arr2[arr2.length/2] = 30; //arr2[2] = 30;
		arr2[3] = 40;
		arr2[arr2.length - 1] = 50; //arr2[4] = 50;
	}
}
