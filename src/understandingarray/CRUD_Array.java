package understandingarray;

public class CRUD_Array {
	public static void main(String[] args) {
		//how to create an array of size 6
		//1st decide data type of array
		char[] arr = new char[6];
		//add value into 3rd index of array - C - Create
		arr[2] = 'A';
		//edit value of 3rd index of array - U - Update
		System.out.println("Before edit: " + arr[2]);
		arr[2] = 'B';
		System.out.println("After edit: " + arr[2]);
		//delete value of 3rd index of array - D - Delete
		arr[2] = '\u0000'; //null character
		
		//print all values of array - R - Read
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		
		//--------------------
		String[] strArr = new String[5];
		//add value into 1st index of array - C - Create
		strArr[0] = "Hello";
		strArr[1] = "World";
		strArr[2] = "Java";
		//edit value of 2nd index of array - U - Update
		System.out.println("\nBefore edit: " + strArr[1]);
		strArr[1] = "Python";
		System.out.println("After edit: " + strArr[1]);
		//delete value of 1st index of array - D - Delete
		strArr[0] = null; 
		
		for(int i=0;i<strArr.length;i++) {
			System.out.print(strArr[i] + " ");
		}
		//--------------------
	}
}
