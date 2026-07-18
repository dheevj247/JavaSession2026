package maps;

import java.util.ArrayList;
import java.util.HashMap;

// toString method is overriden in Map hierarchy, when we try to print reference variable, it will internally call
// toString(), and since it is overidden, it will not return reference, rather it will return the values

public class CREATE_PutMethod {
	public static void main(String[] args) {
		HashMap<String, String> gloriaEmpDetails = new HashMap<String, String>();
		gloriaEmpDetails.put("eid", "252");
		gloriaEmpDetails.put("ename", "Gloria");
		gloriaEmpDetails.put("sal","50000");
		System.out.println(gloriaEmpDetails.toString());
		
		ArrayList<String> arrList = new ArrayList<String>();
		arrList.add("Mango");
		arrList.add("Watermelon");
		arrList.add("Apple");
		System.out.println(arrList.toString());
		
		String[] arr = new String[5];
		arr[0] = "Carrot";
		arr[1] = "Beans";
		arr[2] = "Beans";
		System.out.println(arr.toString());
	}
}
