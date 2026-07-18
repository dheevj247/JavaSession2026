package maps;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class DiffBetweenKeySetAndEntrySet {
	public static void main(String[] args) {
		HashMap<String, String> empDetailsFromCheckout = new HashMap<String, String>();
		empDetailsFromCheckout.put("eid", "252");
		empDetailsFromCheckout.put("ename", "Gloria");
		empDetailsFromCheckout.put("sal","50000");
		
		Set<String> set = empDetailsFromCheckout.keySet();
		System.out.println(set);
		
		Set<Entry<String, String>> keyValuePair =  empDetailsFromCheckout.entrySet();
		System.out.println(keyValuePair);
	}
}
