package collection_ragini;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class Fruits {

	public static void main(String[] args) {
		ArrayList<String> listOfFruits = new ArrayList<String>();
		listOfFruits.add("Watermelon");
		listOfFruits.add("Apple");
		listOfFruits.add("Apple");
		listOfFruits.add("Orange");
		System.out.println(listOfFruits);
		System.out.println(listOfFruits.get(1));
		Collections.sort(listOfFruits);
		System.out.println(listOfFruits + " After Sorting");
		
		
		HashSet<String> listOfVegs = new HashSet<String>(); //set No,No duplicates insertion ,No Indexing no get method 
		listOfVegs.add("Radish");
		listOfVegs.add("Patatoes");
		listOfVegs.add("Pallak");
		listOfVegs.add("Chilly");
		listOfVegs.add("Carrot");
		listOfVegs.add("Pallak");
		System.out.println(listOfVegs);
		
		TreeSet<String> listOfToys = new TreeSet<String>(); // no insertion but automatic sort
		listOfToys.add("Zebra");
		listOfToys.add("Camel");
		listOfToys.add("Animal Toys");
		listOfToys.add("MonkeyToys");
		listOfToys.add("MonkeyToys");
		System.out.println(listOfToys);
		System.out.println(listOfToys.getFirst());
		
		
		
	}	
}
