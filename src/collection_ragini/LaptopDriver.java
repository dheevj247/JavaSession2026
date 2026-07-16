package collection_ragini;

import java.util.ArrayList;
import java.util.HashSet;



public class LaptopDriver {

	public static void main(String[] args) {
		
		Laptop lap = new Laptop();
		HashSet<String> laptop1 = lap.createSingleLaptop("Lenovo", "8 GB", "2 TB", "70000");
		HashSet<String> laptop2 = lap.createSingleLaptop("Dell", "16 GB", "4 TB", "90000");
		HashSet<String> laptop3 = lap.createSingleLaptop("HP", "8 GB", "1 TB", "50000");
				
		HashSet<HashSet<String>> listOfLaptops = new HashSet<HashSet<String>>();
		listOfLaptops.add(laptop1);
		listOfLaptops.add(laptop2);
		listOfLaptops.add(laptop3);
		
		lap.addAllLaptops(listOfLaptops);
		
		HashSet<String> dellLaptop = lap.displayLaptopByBrand("MSI");
		lap.removeLaptopByBrand("Dell");
		
		lap.displayAllLaptopsUsingForEach();
		lap.displayAllLaptopsUsingIterator();
		HashSet<String> laptop4  = lap.createSingleLaptop("Carrot", "8 GB", "1 TB", "50000");
		listOfLaptops.add(laptop4);
		lap.addAllLaptops(listOfLaptops);
		lap.removeLaptopByBrand("Dell");
		lap.displayAllLaptopsUsingForEach();
	}

}
