package StringPrograms;

public class ReverseAString {
	public static void main(String[] args) {
		String str = "Java Programming"; // The string to be reversed
		String reversedStr = ""; // Initialize an empty string to store the reversed string
		for (int i = str.length() - 1; i >= 0; i--) {
			reversedStr = reversedStr + str.charAt(i);
		}
		System.out.println("Original String: " + str);
		System.out.println("Reversed String: " + reversedStr);
	}
		
}
