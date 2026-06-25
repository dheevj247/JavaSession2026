package ragini_demo;

public class StringReverse3 {

	public static void main(String[] args) {

		String str1 = "Java is easy"; // o/p>>easy is Java" L=12 ,I =11
		String updatedStr1 ="";
		for(int i=0;i<str1.length()-1;i++) {
			String word ="";
			while(i<str1.length() && str1.charAt(i) !=' ') {
				word = word+str1.charAt(i);
				i++;
			}
			updatedStr1 = word+ " " +updatedStr1 ;
		}
		System.out.println(updatedStr1);
	}

}
