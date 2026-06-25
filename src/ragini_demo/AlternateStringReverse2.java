package ragini_demo;

public class AlternateStringReverse2 {

	public static void main(String[] args) {

		String str1 = "some days we earn some days we learn"; //length 36 index =35
		String updatedstr1 ="";
	
		
		for(int i=0;i< str1.length()-1;i++ ) {
			String word ="";
			
			while(i<str1.length() && str1.charAt(i) !=' ') {
				 word = word + str1.charAt(i);
				i++;
			}
			
			updatedstr1 = updatedstr1 + word + word.length() + " ";
		}
		System.out.println("Orginial string : " +str1);
		System.out.println("updatedstr1 : " +updatedstr1);
		System.out.println(updatedstr1.trim());
		

	}

}
