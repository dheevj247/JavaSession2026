package collectionframework;

import java.util.ArrayList;

public class AccessingArrayList {

	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Banana");
		
		// Accessing elements from an ArrayList using get() method
		String getBanana = fruits.get(1);
		System.out.println("Accessing element at index 1: " + getBanana);
		
		// Accessing elements from an ArrayList using for loop
		System.out.println("Accessing elements using for loop:");
		for (int i = 0; i < fruits.size(); i++) {
			System.out.println(fruits.get(i));
		}
		
		// Accessing elements from an ArrayList using for-each loop
		// Syntax
//		for (DataType variable : Collection/Array/Map/GroupOfElements) {
//			// code block to be executed
//		}
	
	}

}
