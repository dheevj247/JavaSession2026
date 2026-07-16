package Collection_Suma;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class Fruits {
	public static void main(String[] args) {
		ArrayList<String> listOfFruits = new ArrayList<String>();
		listOfFruits.add("Orange");
		listOfFruits.add("Orange");
		listOfFruits.add("Watermelon");
		listOfFruits.add("Mango");
		System.out.println(listOfFruits);
		System.out.println(listOfFruits.get(1));
		Collections.sort(listOfFruits);
		System.out.println(listOfFruits + " AfterSorting ");
		
		HashSet<String> listOfVeges = new HashSet<String>();
		listOfVeges.add("Tomato");
		listOfVeges.add("Radish");
		listOfVeges.add("Radish");
		listOfVeges.add("Chilli");
		listOfVeges.add("Potato");
		listOfVeges.add("Ladies Finger");
		System.out.println(listOfVeges);
		//System.out.println(listOfVeges.get(2));
		
		//(No incertion and hence no indexing, does not allow duplicate, Default sorting on alphabetic order)
		
		TreeSet<String> listOfChocolates = new TreeSet<String>();
		listOfChocolates.add("FiveStar");
		listOfChocolates.add("Munch");
		listOfChocolates.add("DairyMilk");
		listOfChocolates.add("Cadburries");
		System.out.println(listOfChocolates);
		
	}

}
