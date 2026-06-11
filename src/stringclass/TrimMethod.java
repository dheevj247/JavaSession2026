package stringclass;

public class TrimMethod {
	public static void main(String[] args) {
		
		String str1 = "   Hello World   ";
		System.out.println("Original String: '" + str1 + "'");
		
		//trim() method removes leading and trailing whitespace
		String trimmedStr = str1.trim();
		System.out.println("Trimmed String: '" + trimmedStr + "'");
	}
}
