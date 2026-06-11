package stringclass;

public class ConcatMethod {
	public static void main(String[] args) {
		
		//Concatination using + operator
		String str1 = "Hello";
		String str2 = "World";
		String result = str1 + " " + str2;
		System.out.println(result);
		System.out.println("====================");
		
		//Concatination using concat() method
		String str3 = "Java";
		String str4 = "Programming";
		String result2 = str3.concat(" ").concat(str4);
		System.out.println(result2);
	}
}
