package stringclass;

public class ContainsMethod {

	public static void main(String[] args) {
		String str1 = "National Anthem of India was written by Rabindranath Tagore";
		boolean containsValue = str1.contains("China");
		if(containsValue) {
			System.out.println("The string contains 'Rabindranath Tagore'");
		} else {
			System.out.println("The string does not contain");
		}
	}

}
