package maps;

import java.util.HashMap;

public class CREATE2_PutAllMethod {
	
	public static void main(String[] args) {
		HashMap<String, String> gloriaEmpDetails = new HashMap<String, String>();
		gloriaEmpDetails.put("eid", "252");
		gloriaEmpDetails.put("ename", "Gloria");
		gloriaEmpDetails.put("sal","50000");
		System.out.println(gloriaEmpDetails);
		
		HashMap<String, String> patrickEmpDetails = new HashMap<String, String>();
		patrickEmpDetails.put("eid", "222");
		patrickEmpDetails.put("ename", "Patrick");
		patrickEmpDetails.put("sal","40000");
		System.out.println(patrickEmpDetails);
		
		HashMap<String, String> allEmpDetails = new HashMap<String, String>();
		allEmpDetails.putAll(gloriaEmpDetails);
		System.out.println(allEmpDetails);
		allEmpDetails.putAll(patrickEmpDetails);
		System.out.println(allEmpDetails);
	}

}
