package StringPrograms;

public class ConversionOfCase {

	public static void main(String[] args) {
		String str = "Rainbow";
		String output = toUpperCaseConvert(str);
		System.out.println("Original String : " + str);
		System.out.println("Upper Case String : " + output);
	}

	public static String toUpperCaseConvert(String str) {
		String upperCaseStr = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'a' && ch <= 'z') { 
				upperCaseStr = upperCaseStr + (char) (ch - 32);
			} else {
				upperCaseStr = upperCaseStr + ch;
			}
		}
		return upperCaseStr;
	}
}
