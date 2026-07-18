package maps;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class KeySetAndEntrySetMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> empDetailsFromCheckout = new HashMap<String, String>();
		empDetailsFromCheckout.put("eid", "252");
		empDetailsFromCheckout.put("ename", "Gloria");
		empDetailsFromCheckout.put("sal","50000");
		
		HashMap<String, String> empDetailsFromOrderConfirmation = new HashMap<String, String>();
		empDetailsFromOrderConfirmation.put("eid", "252");
		empDetailsFromOrderConfirmation.put("ename", "Patrick");
		empDetailsFromOrderConfirmation.put("sal","50000");
		
		//Comparision using keySet
		//compare actual details are same as expected details
		for (String key : empDetailsFromCheckout.keySet()) {
		    String checkoutValue = empDetailsFromCheckout.get(key);
		    String confirmationValue = empDetailsFromOrderConfirmation.get(key);

		    if (checkoutValue.equals(confirmationValue)) {
		        System.out.println("Match found for key: " + key + " -> " + checkoutValue);
		    } else {
		        System.out.println("Mismatch for key: " + key + 
		                           " | Checkout: " + checkoutValue + 
		                           " | Confirmation: " + confirmationValue);
		    }
		}
		
		//Comparision using entrySet
		// Compare actual details are same as expected details using entrySet
		for (Entry<String, String> checkoutEntry : empDetailsFromCheckout.entrySet()) {
		    String key = checkoutEntry.getKey();
		    String checkoutValue = checkoutEntry.getValue();

		    // Get corresponding value from order confirmation map
		    String confirmationValue = empDetailsFromOrderConfirmation.get(key);

		    if (checkoutValue.equals(confirmationValue)) {
		        System.out.println("Match found for key: " + key + " -> " + checkoutValue);
		    } else {
		        System.out.println("Mismatch for key: " + key +
		                           " | Checkout: " + checkoutValue +
		                           " | Confirmation: " + confirmationValue);
		    }
		}


	}

}
