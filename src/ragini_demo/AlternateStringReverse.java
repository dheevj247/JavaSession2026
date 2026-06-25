package ragini_demo;

public class AlternateStringReverse {

	public static void main(String[] args) {
		
			String str1 = "Michael Jackson is Dancer";
			String reversedstr1 ="";
			int wordcount = 0;
			//OuterLOOP
			for(int i=0;i< str1.length()-1;i++ ) {
				String word ="";
				//Inner Loop
				while(i<str1.length() && str1.charAt(i)!=' ') {
					if(wordcount%2==0) {
						word = str1.charAt(i)+word;
					}else {
						word = word + str1.charAt(i);
					}
					i++;
				}
				wordcount++;
				reversedstr1 = reversedstr1 + " " +word ;
			}
			System.out.println("Orginial string : " +str1);
			System.out.println("reversedstr1 : " +reversedstr1  );
		}

	}


