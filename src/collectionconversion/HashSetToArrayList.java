package collectionconversion;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetToArrayList {
	public static void main(String[] args) {
		HashSet<Character> charSet = new HashSet<Character>();
		charSet.add('b');
		charSet.add('z');
		charSet.add('a');
		System.out.println("HashSet : "+charSet);
		
		ArrayList<Character> charArrayList = new ArrayList<Character>(charSet);
		System.out.println("ArrayList : "+charArrayList);
	}
}
