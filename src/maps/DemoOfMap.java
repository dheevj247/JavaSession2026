package maps;

import java.util.ArrayList;
import java.util.HashMap;

public class DemoOfMap {
	public static void main(String[] args) {
		//Maps: It is a non primitive data type / Dictionary. It stores data in a form of key-value pair
		//Key-value pair: ever value will have a dedicated key, using the key we will have to access the value
		//Can i have a key without a value?
		//Can i have a value without a Key? 
		
		//Map<datatype,datatype> refVariable = new Map<datatype,datatype>();
		//HashMap<Integer,String> ref = new HashMap<String,String>();
		//         key    value
		// MAP: we can not use primitive data to declare key or value in Map, 

		//The type of key,value pair declared should be same as the type of key value pair object being created
		// Example: HashMap<Integer, String> empDetails = new HashMap<Integer, String>();
		// It should not be like HashMap<String, String> empDetails = new HashMap<Integer, Integer>();
		// or we will get CTE.
		
		
		HashMap<Integer, String> empDetails = new HashMap<Integer, String>();
		ArrayList<Integer> allLaptops = new ArrayList<>();
		
		
	}
}
