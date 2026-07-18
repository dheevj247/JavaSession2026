package collectionframework;

import java.util.ArrayList;

public class UnderstandingArrayList {
	
	// Adding elements using non-static built-In methods of Collection interface
	// 1. add(Object o)
	// 2. addAll(Collection c)
	// Additional methods of ArrayList class
	// 1. add(int index, Object o)
	// 2. addAll(int index, Collection c)

	
	public static void main(String[] args) {
		//syntax of ArrayList
		String[] arr = new String[5];
		arr[0] = "Java";
		arr[1] = "Python";
		arr[2] = "C++";
		arr[3] = "C#";
		arr[4] = "JavaScript";
		//arr[5] = "PHP"; // This will throw ArrayIndexOutOfBoundsException because the array size is 5 and index 5 is out of bounds.
		
		for(int i=0; i<arr.length; i++) {
			System.out.print("Values stored in array : "+ arr[i]);
			System.out.println();
		}
		System.out.println("--------------------------------------------------");
		ArrayList list = new ArrayList();
		// Adding elements to the ArrayList using add(Object o) method
		list.add("Java");
		list.add("Python");
		list.add("C++");
		list.add("C#");
		list.add("JavaScript");
		list.add("PHP");
		list.add("Ruby");
		list.add(1);
		list.add(2);
		list.add(false);
		System.out.println(list);
		
		// ArrayList: we can not create an arraylist of int (primitive) type
		// ArrayList<int> list = new ArrayList<int>(); //CTE
		
	}
}
