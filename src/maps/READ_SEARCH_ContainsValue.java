package maps;

import java.util.HashMap;

public class READ_SEARCH_ContainsValue {

	public static void main(String[] args) {
		HashMap<String, String> gloriaEmpDetails = new HashMap<String, String>();
		gloriaEmpDetails.put("eid", "252");
		gloriaEmpDetails.put("ename", "Gloria");
		gloriaEmpDetails.put("sal","50000");
		System.out.println(gloriaEmpDetails);
		
		//containsValue() method is used to check if a value is available in Map
		//the return type of containsValue() is boolean
		//if the value is available, it will return true
		//else, false
		if(gloriaEmpDetails.containsValue("Gloria")) { 
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
		if(gloriaEmpDetails.containsValue("Patrick")) { 
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
