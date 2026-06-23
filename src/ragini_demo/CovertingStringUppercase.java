package ragini_demo;

public class CovertingStringUppercase {

	public static String toLowerCaseCoverting(String str) {
		String lowerCaseStr = "";
		for(int i=0;i< str.length();i++) {
			char ch =str.charAt(i);
			if(ch>='A' && ch <='Z') {
				lowerCaseStr = lowerCaseStr + (char)(ch+32);
			}else {
				lowerCaseStr = lowerCaseStr +ch;
			}
		}
		return  lowerCaseStr;
	}

	public static void main(String[] args) {
		String str = "RAINBOW";
		String output =toLowerCaseCoverting(str);
		System.out.println("Original String: " +str);
		System.out.println("Lower case String: " +output);
		System.out.println(output.toUpperCase());
	}
}
