package stringclass;

public class DifferenceBetweenEqualsAndEqualIgnoreCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String word1 = "HELLO";
		String word2 = "hello";
		boolean isEqual = word1.equals(word2);
		System.out.println("Using equals method: " + isEqual); // Output: false
		
		boolean isEqualIgnoreCase = word1.equalsIgnoreCase(word2);
		System.out.println("Using equalsIgnoreCase method: " + isEqualIgnoreCase); // Output: true
	}
}
