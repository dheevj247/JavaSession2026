package demo_suma;

public class ReverseSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Java is easy";
		String updatesStr="";
		for(int i=0;i< str1.length()-1;i++ ) {
			String word ="";
			while(i<str1.length() && str1.charAt(i)!=' ') {
				word = word+str1.charAt(i);
				i++;
			}
			updatesStr = word+ " " + updatesStr;
		}
		System.out.println(updatesStr);
	}
}
