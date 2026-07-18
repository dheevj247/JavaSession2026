package maps;

import java.util.HashMap;

public class READ_SEARCH_ContainsKey {
	public static void main(String[] args) {
		HashMap<String, String> gloriaEmpDetails = new HashMap<String, String>();
		gloriaEmpDetails.put("eid", "252");
		gloriaEmpDetails.put("ename", "Gloria");
		gloriaEmpDetails.put("sal","50000");
		System.out.println(gloriaEmpDetails);
		
		//containsKey() method is used to check if a particular key is available in Map
		//the return type of containsKey() is boolean
		//if the key is available, it will return true
		//else, false
		if(gloriaEmpDetails.containsKey("eid")) { 
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
		if(gloriaEmpDetails.containsKey("dob")) { 
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
