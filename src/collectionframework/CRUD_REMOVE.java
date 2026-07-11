package collectionframework;

import java.util.ArrayList;

public class CRUD_REMOVE {
	//remove() method is used to remove an element from the collection.
	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Banana");
		
		ArrayList<String> vegetables = new ArrayList<>();
		vegetables.add("Carrot");
		vegetables.add("Broccoli");
		
		ArrayList cart = new ArrayList();
		cart.add(fruits);
		cart.add("Chocolate");
		cart.add("Juice");
		
		System.out.println("Cart before removing: " + cart);
		System.out.println("Size of cart before removing: " + cart.size());
		
		// Remove the fruits ArrayList from the cart
		cart.remove(fruits);
		System.out.println("Cart after removing: " + cart);
		cart.remove("Chocolate");
		System.out.println("Cart after removing: " + cart);
		
		//adding the fruits & chocolate back to the cart
		cart.add(fruits);
		cart.add("Chocolate");
		
		// RemoveAll() method : it will remove only collection
//		cart.removeAll("Chocolate");
		
	}
}
