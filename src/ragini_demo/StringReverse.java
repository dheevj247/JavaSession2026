package ragini_demo;

public class StringReverse {

	public static void main(String[] args) {
		String str = "Java is a programming language"; //L = 29
		String reversedstr ="";	
		for (int i = str.length() - 1; i >= 0; i--) {
			reversedstr = reversedstr + str.charAt(i);
		}
		System.out.println("Original String :" +str);
		System.out.println("Reversed String :" +reversedstr);
	}

}






