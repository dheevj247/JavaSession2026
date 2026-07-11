package collectionframework;

import java.util.ArrayList;

public class CRUD_SEARCH_2 {
	public static void main(String[] args) {
		// Generic ArrayList - heterogeneous data types
		ArrayList books = new ArrayList();
		books.add("Ramayan");
		books.add("Mahabharat");
		books.add("Bhagavad Gita");
		
		System.out.println("Books in the list: " + books);
		
		String book1 = (String) books.get(0);
		System.out.println("Book at index 0: " + book1);
		
		//Specific String ArrayList - homogeneous data types
		ArrayList<String> books2 = new ArrayList<>();
		books2.add("Hanuman Chalisa");
		books2.add("Shiv Tandav Stotram");
		books2.add("Lalitha Sahasranamam");
		
		String book2 = books2.get(1);
		System.out.println("Book at index 1: " + book2);
		
		String lastBook = books2.get(books2.size() - 1);
		System.out.println("Last book in the list: " + lastBook);
		
		//indexOf(Object o) method
		int index = books2.indexOf("Shiv Tandav Stotram");
		System.out.println("Index of 'Shiv Tandav Stotram': " + index);

		//lastIndexOf(Object o) method
		books2.add("Hanuman Chalisa");
		int lastIndex = books2.lastIndexOf("Hanuman Chalisa");
		System.out.println("Last index of 'Hanuman Chalisa': " + lastIndex);
		
		
	}
}
