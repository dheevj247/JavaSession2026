package ragini_demo;

public class StringReverseByWord {

	public static void main(String[] args) {

		String str1 = "Java is a programming language";
		String reversedstr1 ="";
		for(int i=0;i< str1.length()-1;i++ ) {
			String word ="";
			while(i<str1.length() && str1.charAt(i)!=' ') {
				word = str1.charAt(i) + word;				
				i++;		
			}
			reversedstr1 = reversedstr1 + " " +word ;
		}
		System.out.println("Orginial string : " +str1);
		System.out.println("reversedstr1 : " +reversedstr1  );
	}

}
