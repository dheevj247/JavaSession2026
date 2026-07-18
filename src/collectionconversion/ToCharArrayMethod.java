package collectionconversion;

public class ToCharArrayMethod {
	public static void main(String[] args) {
		String str = "Apple";
		char[] ch = str.toCharArray();
		String reverse = "";
		for(char c:ch) {
			reverse = c + reverse;
		}
		System.out.println(reverse);
	}
}
