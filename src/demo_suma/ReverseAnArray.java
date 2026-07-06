package demo_suma;

public class ReverseAnArray {

	public static void main(String[] args) {
		//Method 1 
		int[] arr = {14 ,63 ,21 ,5 , 85};//output = {85 ,5 ,21 ,63 ,14}
		for(int i = arr.length-1 ; i >= 0 ; i-- ) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
		//Method2 : Storing Reverse array in a new array variable.
		int[] arr1 = new int[5];
		int count =0;
		for(int i = arr.length-1 ; i >= 0 ; i-- ) {
			arr1[count] = arr[i];
			count++;
		}	
		for(int i = 0 ; i < arr1.length ; i++) {
			System.out.print(arr1[i] + " ");
		}
	}

}
