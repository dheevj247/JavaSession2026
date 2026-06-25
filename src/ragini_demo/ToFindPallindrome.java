package ragini_demo;

public class ToFindPallindrome {



	public static void main(String[] args) {

		String str ="malayalam";

		String reversedstr ="";	


		for (int i = str.length() - 1; i >= 0; i--) {
			reversedstr = reversedstr + str.charAt(i);
		}

		if(str.equals(reversedstr)) {
			System.out.println("malayam is a pallindrome");

		}
		else {
			System.out.println("malayam is a pallindrome");
		}

	}
}