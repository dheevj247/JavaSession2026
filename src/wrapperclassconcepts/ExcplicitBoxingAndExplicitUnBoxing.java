package wrapperclassconcepts;

public class ExcplicitBoxingAndExplicitUnBoxing {
	public static void main(String[] args) {
		// Explicit Boxing 
		Integer i = Integer.valueOf(34); // Explicitly converting int to Integer
		Double dd = Double.valueOf(34.5); // Explicitly converting double to Double
		Character c = Character.valueOf('A'); // Explicitly converting char to Character
		Boolean b = Boolean.valueOf(true); // Explicitly converting boolean to Boolean
		
		// Explicit Unboxing
		int a = i.intValue(); // Explicitly converting Integer to int
		double d = dd.doubleValue(); // Explicitly converting Double to double
		char ch = c.charValue(); // Explicitly converting Character to char
		boolean bool = b.booleanValue(); // Explicitly converting Boolean to boolean
		
//		String str = "CPU load of Chrome process: 6.9%";
//		String[] parts = str.split(" ");
//		String percentage = parts[parts.length - 1];
//		String removedPercentage = percentage.replace("%", "");
//		Double percentageValue = Double.valueOf(removedPercentage);
//		double primitiveDoublepercentageValue = percentageValue.doubleValue(); // 
//		System.out.println("Percentage value: " + primitiveDoublepercentageValue);
		
		//Optimized way to convert String to double
		String str[] = "CPU load of Chrome process: 6.9%".split(" ");
		String percentage = str[str.length - 1].replace("%", "");
		double primitiveDoublepercentageValue = Double.parseDouble(percentage);
		System.out.println("Percentage value: " + primitiveDoublepercentageValue);
	}
}