package stringclass;

public class CharAtmethod {
	public static void main(String[] args) {
		String str1 = "123456789";
		char letter = str1.charAt(4);
		System.out.println(letter);
		
		//>= length of the string = StringIndexOutOfBoundsException
		//char letter1 = str1.charAt(10);
		//System.out.println(letter1);
		
		//< 0 = StringIndexOutOfBoundsException
		//char letter2 = str1.charAt(-1);
		//System.out.println(letter2);
	}
}
