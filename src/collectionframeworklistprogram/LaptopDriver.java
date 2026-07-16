package collectionframeworklistprogram;

import java.util.ArrayList;

public class LaptopDriver {
	public static void main(String[] args) {
		Laptop lap = new Laptop();
		ArrayList<String> laptop1 = lap.createSingleLaptop("Lenovo", "8 GB", "2 TB", "70000");
		ArrayList<String> laptop2 = lap.createSingleLaptop("Dell", "16 GB", "4 TB", "90000");
		ArrayList<String> laptop3 = lap.createSingleLaptop("HP", "8 GB", "1 TB", "50000");
				
		ArrayList<ArrayList<String>> listOfLaptops = new ArrayList<ArrayList<String>>();
		listOfLaptops.add(laptop1);
		listOfLaptops.add(laptop2);
		listOfLaptops.add(laptop3);
		
		lap.addAllLaptops(listOfLaptops);
		
		ArrayList<String> dellLaptop = lap.displayLaptopByBrand("MSI");
		lap.removeLaptopByBrand("Dell");
		
		lap.displayAllLaptopsUsingForEach();
		lap.displayAllLaptopsUsingIterator();
	}
}
