package collectionframework;

import java.util.ArrayList;

public class CRUD_ADD_ {

	public static void main(String[] args) {
		
		ArrayList fruits = new ArrayList();
		// Adding elements to the ArrayList using add(Object o) method
		fruits.add("Apple");
		fruits.add("Banana");
		System.out.println(fruits);
		
		ArrayList vegetables = new ArrayList();
		// Adding elements to the ArrayList using add(Object o) method
		vegetables.add("Carrot");
		vegetables.add("Potato");
		System.out.println(vegetables);
		
		ArrayList dryFruits = new ArrayList();
		// Adding elements to the ArrayList using add(int index, Object o) method
		dryFruits.add("Almond");
		dryFruits.add("Cashew");
		
		ArrayList cart = new ArrayList();
		// Adding elements to the ArrayList using addAll(Collection c) method
		cart.addAll(fruits);
		cart.addAll(vegetables);
		cart.addAll(dryFruits);
		System.out.println("Unorganized Cart : "+ cart);
		
		ArrayList organizedCart = new ArrayList();
		// Adding elements to the ArrayList using add(Object o) method
		organizedCart.add(fruits);
		organizedCart.add(vegetables);
		organizedCart.add(dryFruits);
		System.out.println("Organized Cart : "+ organizedCart);
		
		System.out.println("--------------------------------------------------");
		// Size of the ArrayList
		System.out.println("Size of the Unorganized Cart : "+ cart.size());
		System.out.println("Size of the Organized Cart : "+ organizedCart.size());
	
		
	
	}
}
