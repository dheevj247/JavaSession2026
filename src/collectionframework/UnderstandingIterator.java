package collectionframework;

import java.util.ArrayList;
import java.util.Iterator;

public class UnderstandingIterator {

	public static void main(String[] args) {
		//Iterator(), is a built in method, it belongs to Iterable interface
		// It is used to iterate or loop over the collection.
		
		ArrayList<String> appliances = new ArrayList<String>();
		appliances.add("Television");
		appliances.add("Washing Machine");
		appliances.add("Mobile");
		
		// iterator() is a builtIn non static method available in Iterable interface
		// to call iterator() method, since it is non static, we need to create an Iterable type Object
		// We are creating ArrayList object as it is one of the child class of Iterable interface
		// using arraylist reference we are calling iterator() method
		
		// iterator method will internally create a Iterator type object
		// and it will return the reference of Iterator type
		// we can then store the reference returned by iterator() method like Iterator i = appliances.iterator();
		// Iterator<String>, the reason why we are using <String> because ArrayList is of <String>
		// using 'i' (reference variable of Iterator type) we can use nonstatic methods like hasNext() & next()
		// hasNext() : by default it will point to '0th' index
		// next() : it will return the value that is present in the index where hasNext() is pointing to, 
		// and once the value is returned, it will increment the index of hasNext()
		Iterator<String> i = appliances.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
	}

}
