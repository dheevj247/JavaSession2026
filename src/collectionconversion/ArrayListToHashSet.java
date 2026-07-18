package collectionconversion;

import java.util.ArrayList;
import java.util.HashSet;

public class ArrayListToHashSet {

	public static void main(String[] args) {
		ArrayList<Double> arrList = new ArrayList<Double>();
		arrList.add(25.36);
		arrList.add(85.16);
		System.out.println("ArrayList : "+arrList);
		
		HashSet<Double> set = new HashSet<Double>(arrList);
		System.out.println("HashSet : "+set);
	}
}
