package maps;

import java.util.HashMap;

public class DELETE_RemoveAndClear {
	public static void main(String[] args) {
		HashMap<String, String> gloriaEmpDetails = new HashMap<String, String>();
		gloriaEmpDetails.put("eid", "252");
		gloriaEmpDetails.put("ename", "Gloria");
		gloriaEmpDetails.put("sal","50000");
		System.out.println(gloriaEmpDetails);
		
		System.out.println("-----------------After remove---------------");
		gloriaEmpDetails.remove("sal");
		System.out.println(gloriaEmpDetails);
		
		System.out.println("-----------------After clear---------------");
		gloriaEmpDetails.clear();
		System.out.println(gloriaEmpDetails);
	}
}
