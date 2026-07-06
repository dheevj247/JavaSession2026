package understandingarray;

public class UnderstandingSyntax {

	public static void main(String[] args) {
		
		//Syntax 1
		int[] arr = { 1, 2, 3, 4, 5 };
		int[] arr2 = {9, 8,5, 6, 7,3, 4, 2, 1};
		int normalInt = 10;
		String str = "Hello World";
		
		System.out.println("Normal Integer: " + normalInt);
		System.out.println("Array Integer: " + arr);
		System.out.println("Index 0 of Array: " + arr[0]);
		System.out.println("Last Index of Array: " + arr[arr.length - 1]);
		System.out.println("length of arr2: " + arr2.length);
		System.out.println("Last Index of arr2: " + arr2[arr2.length - 1]);
		System.out.println("length of str: " + str.length());
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
