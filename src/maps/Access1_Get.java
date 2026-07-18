package maps;

import java.util.HashMap;

public class Access1_Get {

	public static void main(String[] args) {
		HashMap<String, String> gloriaEmpDetails = new HashMap<String, String>();
		gloriaEmpDetails.put("eid", "252");
		gloriaEmpDetails.put("ename", "Gloria");
		gloriaEmpDetails.put("sal","50000");
		System.out.println(gloriaEmpDetails);
		
		//Syntax of get(String key)
		//get method will return the value of the key.
		String name = gloriaEmpDetails.get("ename");
		System.out.println(name);
	}

}
