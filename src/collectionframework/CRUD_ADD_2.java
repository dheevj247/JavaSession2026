package collectionframework;

import java.util.ArrayList;
import java.util.LinkedList;

public class CRUD_ADD_2 {
	// Difference between add() and addAll
	// add() method is used to add a single element to the collection
	// single element can be either a String, Integer, Double or a whole collection 
	
	// addAll() method is used to add all the elements of a collection
	// it dumps all the elements of a collection into another collection
	
	// add(int index, E element) method is used to add an element
	// at a specific index in the collection
	
	public static void main(String[] args) {
		//Add(int index, E element) method
		ArrayList<String> movies = new ArrayList<String>();
		movies.add("Raceguram");
		movies.add("Peddi");
		movies.add("Bheemla Nayak");
		System.out.println("Movies List: " + movies);
		
		movies.add(2, "Pushpa"); //overloaded add() method
		System.out.println("Movies List after adding Pushpa at index 1: " + movies);
		
		LinkedList<String> movies2 = new LinkedList<String>();
		movies2.add("Tarzan");
		movies2.add("Jungle Book");
		System.out.println("Movies List: " + movies2);
		
		movies2.add(1, "The Lion King"); //overloaded add() method
		System.out.println("Movies List after adding The Lion King at index 1: " + movies2);
		
	}
}
