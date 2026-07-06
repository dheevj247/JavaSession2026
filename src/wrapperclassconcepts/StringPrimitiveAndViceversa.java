package wrapperclassconcepts;

public class StringPrimitiveAndViceversa {
	public static void main(String[] args) {
		//String to primitive data type char
		String name = "John";
		char firstChar = name.charAt(0); // String to char
		System.out.println("First character of name: " + firstChar);
		
		//Convert String to primitive data type double
		//Example 1:
		String percentage = "6.9%";
		double percentageValue = Double.parseDouble(percentage.replace("%", "")); // String to double
		System.out.println("Percentage value: " + percentageValue);
		
		//Example 2:
		String grade = "6.9 Grade";
		double gradeValue = Double.parseDouble(grade.replaceAll("[^0-9.]", "").trim());// String to double
		System.out.println("Grade value: " + gradeValue);
		
		//Convert primitive data type double to String
		double amount = 34000.789;
		String amountString = String.valueOf(amount); // double to String
		String str = "" + amount; // double to String
		System.out.println("Amount String: " + amountString);
		System.out.println("Amount String: " + str);
	}
}
