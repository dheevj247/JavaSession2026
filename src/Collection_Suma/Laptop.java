package Collection_Suma;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Laptop {
		private String brand;
		private String ram;
		private String hardisk;
		private String price;
		
		private HashSet<HashSet<String>> allLaptops = null;
		private HashSet<String> singleLaptop = null;
		//HashSet<String> listOfVeges = new HashSet<String>();
		public Laptop() {
			
		}
		
		public HashSet<String> createSingleLaptop(String brand, String ram, String hardisk, String price) {
			singleLaptop = new HashSet<String>();
			singleLaptop.add(brand);
			singleLaptop.add(ram);
			singleLaptop.add(hardisk);
			singleLaptop.add(price);
			return singleLaptop;
		}
		
		public void addAllLaptops(HashSet<HashSet<String>> listOfLaptops) {
			allLaptops = new HashSet<HashSet<String>>();
			allLaptops.addAll(listOfLaptops);
			System.out.println("Laptops are added as follows : "+allLaptops);
		}
		
		public HashSet<String> displayLaptopByBrand(String brand) {
			HashSet<String> requiredLaptop = null;
	 		for(HashSet<String> actualLaptop : allLaptops) {
				if(actualLaptop.contains(brand)) {
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
			HashSet<String> actualRemovedLaptop = null;
			for(HashSet<String> actualLaptop : allLaptops) {
				if(actualLaptop.contains(brand)) {
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
			for(HashSet<String> laptop : allLaptops) {
				System.out.println(laptop);
			}
		}
		
		public void displayAllLaptopsUsingIterator() {
			System.out.println("----- Displaying All Laptops using Iterator -----");
			Iterator<HashSet<String>> iterator = allLaptops.iterator();
			while(iterator.hasNext()) {
				System.out.println(iterator.next());
			}
		}
		

}
