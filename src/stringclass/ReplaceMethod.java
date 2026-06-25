package stringclass;

public class ReplaceMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-----------Before replacing the string-----------");
		String str = "Rahul is a good wicket keeper. Rahul is a good batsman too.";
		System.out.println("Original String: " + str);
		System.out.println("-----------After replacing the string-----------");
		String replacedStr = str.replace("Rahul", "Rohit");
		System.out.println("Replaced String: " + replacedStr);
	}

}
