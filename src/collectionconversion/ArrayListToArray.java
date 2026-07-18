package collectionconversion;

import java.util.ArrayList;

public class ArrayListToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Double> arrList = new ArrayList<Double>();
		arrList.add(25.36);
		arrList.add(85.16);
		System.out.println("ArrayList : "+arrList);
		
		Object[] arr = arrList.toArray();
		for(Object d:arr) {
			System.out.println(d);
		}
	}

}
