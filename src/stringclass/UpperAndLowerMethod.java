package stringclass;

public class UpperAndLowerMethod {

	public static void main(String[] args) {
		String str1 = "Hello World"; //Init Cap
		System.out.println("Original String: " + str1);
		//uppercase
		String upperStr = str1.toUpperCase();
		System.out.println("Uppercase String: " + upperStr);
		
		//lowercase
		String lowerStr = str1.toLowerCase();
		System.out.println("Lowercase String: " + lowerStr);
		
		//uppercase case scenario 2
		lowerStr = lowerStr.toUpperCase();
		System.out.println("Lowercase String after toUpperCase() method: " + lowerStr);
	}

}
