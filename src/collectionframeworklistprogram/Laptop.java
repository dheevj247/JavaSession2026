package collectionframeworklistprogram;

import java.util.ArrayList;
import java.util.Iterator;

public class Laptop {
	private String brand;
	private String ram;
	private String hardisk;
	private String price;
	
	private ArrayList<ArrayList<String>> allLaptops = null;
	private ArrayList<String> singleLaptop = null;
	
	public Laptop() {
		
	}
	
	public ArrayList<String> createSingleLaptop(String brand, String ram, String hardisk, String price) {
		singleLaptop = new ArrayList<String>();
		singleLaptop.add(brand);
		singleLaptop.add(ram);
		singleLaptop.add(hardisk);
		singleLaptop.add(price);
		return singleLaptop;
	}
	
	public void addAllLaptops(ArrayList<ArrayList<String>> listOfLaptops) {
		allLaptops = new ArrayList<ArrayList<String>>();
		allLaptops.addAll(listOfLaptops);
		System.out.println("Laptops are added as follows : "+allLaptops);
	}
	
	public ArrayList<String> displayLaptopByBrand(String brand) {
		ArrayList<String> requiredLaptop = null;
 		for(ArrayList<String> actualLaptop : allLaptops) {
			if(actualLaptop.get(0).equalsIgnoreCase(brand)) {
				requiredLaptop = actualLaptop;
				break;
			}
		}
 		if(requiredLaptop == null) {
 			System.out.println(brand + " is currently not available");
 		} else {
 			System.out.println(requiredLaptop);
 		}
		return requiredLaptop;
	}
	
	public void removeLaptopByBrand(String brand) {
		ArrayList<String> actualRemovedLaptop = null;
		for(ArrayList<String> actualLaptop : allLaptops) {
			if(actualLaptop.get(0).equalsIgnoreCase(brand)) {
				actualRemovedLaptop = actualLaptop;
				allLaptops.remove(actualLaptop);
				break;
			}
		}
		if(actualRemovedLaptop == null) {
 			System.out.println(brand + " is currently not available");
 		} else {
 			System.out.println("Removed laptop : "+ actualRemovedLaptop);
 			System.out.println("Laptops after removal" + allLaptops);
 		}
	}
	
	public void displayAllLaptopsUsingForEach() {
		System.out.println("----- Displaying All Laptops using for -----");
		for(ArrayList<String> laptop : allLaptops) {
			System.out.println(laptop);
		}
	}
	
	public void displayAllLaptopsUsingIterator() {
		System.out.println("----- Displaying All Laptops using Iterator -----");
		Iterator<ArrayList<String>> iterator = allLaptops.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
