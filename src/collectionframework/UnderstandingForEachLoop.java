package collectionframework;

import java.util.ArrayList;

public class UnderstandingForEachLoop {
	public static void main(String[] args) {
		String[] fruits = {"Apple", "Banana", "Mango", "Orange"}; //fruits is String array type
		String result = fruits[3]; //result is String type
		
		ArrayList<String> veges = new ArrayList<>(); // Vege is String Arraylist type
		veges.add("Tomato");
		veges.add("Potato");
		String vegeResult = veges.get(1);
		
		System.out.println("----------Fruits Array-------------");
		//for each loop for Array
		for (String fruit: fruits) {
			System.out.println(fruit);
		}
		
		System.out.println("----------Vege ArrayList-------------");
		//for each loop for ArrayList
		for (String vege:veges) {
			System.out.println(vege);
		}
	}

}
