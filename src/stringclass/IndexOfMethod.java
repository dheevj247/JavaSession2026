package stringclass;

public class IndexOfMethod {
	public static void main(String[] args) {
		String str = "Banana";
		String str2 = "Hello World";

		//indexOf() method returns the index of the first occurrence of the specified character 
		int indexOfN = str.indexOf('n');
		System.out.println("Index of 'n': " + indexOfN);
		
		int indexOfA = str.indexOf('A');
		System.out.println("Index of 'A': " + indexOfA);
		
		int findL = str2.indexOf('l');
		System.out.println("Index of 'l': " + findL);
		
		//indexOf() method of last 'a' in the string "Banana"
		int lastIndexOfA = str2.indexOf('l', 6);
		System.out.println("Index of last 'l': " + lastIndexOfA);

	}
}
