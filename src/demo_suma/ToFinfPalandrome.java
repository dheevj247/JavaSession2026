package demo_suma;

public class ToFinfPalandrome {

	public static void main(String[] args) {
		String str = "malayalam";
		String reversedStr = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reversedStr = reversedStr + str.charAt(i);
		}
		if (str.equals(reversedStr)) {
			System.out.println("malayalam is a Plandrome");
		}
		else {
			System.out.println("malayalam is not a Plandrome");

		}

	}

}
