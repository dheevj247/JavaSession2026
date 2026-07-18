package maps;

import java.util.HashMap;

public class IsEmptyAndSizeMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> expectedEmpDetails = new HashMap<String, String>();
		expectedEmpDetails.put("eid", "252");
		expectedEmpDetails.put("ename", "Gloria");
		expectedEmpDetails.put("sal","50000");
		
		HashMap<String, String> actualEmpDetails = new HashMap<String, String>();
		actualEmpDetails.put("eid", "252");
		actualEmpDetails.put("ename", "Gloria");
		actualEmpDetails.put("sal","50000");
		
		//isEmpty() returns true when a map is empty, else false
		if(!actualEmpDetails.isEmpty()) {
			if(expectedEmpDetails.equals(actualEmpDetails)) {
				System.out.println("Expected details are same as actual details. Expected Details: "+expectedEmpDetails
						+ " Actual Details: "+actualEmpDetails);
			} else {
				System.out.println("Expected details are not same as actual details. Expected Details: "+expectedEmpDetails
					+ " Actual Details: "+actualEmpDetails);
			}
		} else {
			System.out.println("Employee details are empty");
		}
		
		//size() it return number of entries in a map
		if(actualEmpDetails.size()!=0) {
			if(expectedEmpDetails.equals(actualEmpDetails)) {
				System.out.println("Expected details are same as actual details. Expected Details: "+expectedEmpDetails
						+ " Actual Details: "+actualEmpDetails);
			} else {
				System.out.println("Expected details are not same as actual details. Expected Details: "+expectedEmpDetails
					+ " Actual Details: "+actualEmpDetails);
			}
		} else {
			System.out.println("Employee details are empty");
		}
		
		//both
		if(!actualEmpDetails.isEmpty() && actualEmpDetails.size()!=0) {
			if(expectedEmpDetails.equals(actualEmpDetails)) {
				System.out.println("Expected details are same as actual details. Expected Details: "+expectedEmpDetails
						+ " Actual Details: "+actualEmpDetails);
			} else {
				System.out.println("Expected details are not same as actual details. Expected Details: "+expectedEmpDetails
					+ " Actual Details: "+actualEmpDetails);
			}
		} else {
			System.out.println("Employee details are empty");
		}
		
	}

}
