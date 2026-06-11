package stringclass;

public class SubstringMethod {
	public static void main(String[] args) {
		String strLength = "I am learning Java programming";
		int length = strLength.length();
		System.out.println("Length of the string: " + length);
		
		String str = "I am learning Java programming";
		str = str.substring(14);
		System.out.println(str);
		System.out.println("====================");
		String str2 = "I am learning Java programming";
		str2 = str2.substring(14,18);
		System.out.println(str2);
		System.out.println("====================");
		//if index == length of the string, it will return empty string
		String str3 = "New York City";
		str3 = str3.substring(13);
		System.out.println(str3);
		boolean emptyOrNot = str3.isEmpty();
		System.out.println("Is the string empty? " + emptyOrNot);
		System.out.println("====================");
		
		//if start index == end index, it will return empty string
		 String str5 = "Hello World";
		 str5 = str5.substring(5, 5);
		 System.out.println(str5);
		 System.out.println("Is the string empty? " + str5.isEmpty());
		 System.out.println("====================");
		
		//if index > length of the string, it will throw StringIndexOutOfBoundsException
		String str4 = "New York City";
		str4 = str4.substring(25);
		System.out.println(str4);
	}
}
