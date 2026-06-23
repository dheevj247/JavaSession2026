package demo_suma;

public class ConvertingStringtoUpperCase {
	public static String toConvertLowerCase(String inputString) {
		String upperCase ="";
		for (int i = 0; i<inputString.length();i++) {
			char ch = inputString.charAt(i);
			if (ch>='A' && ch<='Z') {
				upperCase= upperCase +(char) (ch + 32);
			} else {
				upperCase = upperCase + ch;
			}
		}
		return upperCase;
	}

	public static void main(String[] args) {
		String str1 = "RAINBOW";
		String output = toConvertLowerCase(str1);
		System.out.println(output);
		System.out.println(str1.toUpperCase());
	}
}

