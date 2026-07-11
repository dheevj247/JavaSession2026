package collectionframework;

import java.util.ArrayList;

public class CRUD_SEARCH {

	public static void main(String[] args) {
		// In Collection Interface there are two methods to search
		// 1. contains(Object o) method
		// 2. containsAll(Collection c) method
		
		// In List Interface there are three methods to search
		// 1. indexOf(Object o) method
		// 2. lastIndexOf(Object o) method
		// 3. get(int index) method

		ArrayList fruits = new ArrayList();
		fruits.add("Apple");
		fruits.add("Banana");
		
		ArrayList vegetables = new ArrayList();
		vegetables.add("Carrot");
		vegetables.add("Potato");
		
		boolean isFruitAvail = fruits.contains("Apple"); // true
		System.out.println("Is Apple : " + isFruitAvail);
		
		boolean isVegetableAvail = vegetables.contains("Tomato"); // false
		System.out.println("Is Tomato : " + isVegetableAvail);
		
		ArrayList unorganisedList = new ArrayList();
		unorganisedList.addAll(fruits);
		unorganisedList.addAll(vegetables);
		
		System.out.println("Unorganised List : " + unorganisedList);
		System.out.println("Size of Unorganised List : " + unorganisedList.size());
		
		isFruitAvail = unorganisedList.contains("Apple"); 
		System.out.println("Is Apple : " + isFruitAvail);
		
		isVegetableAvail = unorganisedList.contains("Tomato");
		System.out.println("Is Tomato : " + isVegetableAvail);
		
		ArrayList organisedList = new ArrayList();
		organisedList.add(fruits);
		organisedList.add(vegetables);
		System.out.println("Organised List : " + organisedList);
		System.out.println("Size of Organised List : " + organisedList.size());
		
		//Unorganised List
		boolean isFruitsAvail = unorganisedList.contains(fruits); // false
		System.out.println("Is Fruits : " + isFruitsAvail);
		
		unorganisedList.add(fruits);
		System.out.println("Unorganised List : " + unorganisedList);
		isFruitsAvail = unorganisedList.contains(fruits);
		System.out.println("Is Fruits : " + isFruitsAvail); // true
		
		//containsAll(Collection c) method
		boolean isAllFruitsAvail = organisedList.containsAll(fruits); // false
		System.out.println("Is All Fruits : " + isAllFruitsAvail);
		
		organisedList.addAll(fruits);
		System.out.println("Organised List : " + organisedList);
		isAllFruitsAvail = organisedList.containsAll(fruits); // true
		System.out.println("Is All Fruits : " + isAllFruitsAvail);
		
		boolean isVegeAvail = unorganisedList.containsAll(vegetables); // true
		System.out.println("Is All Vegetables : " + isVegeAvail);
	}

}
