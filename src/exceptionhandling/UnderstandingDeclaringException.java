package exceptionhandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class UnderstandingDeclaringException {

	//throws: we use it to declare an exception in a method signature. It is used to indicate that a method may throw an exception during its execution. When a method declares an exception using the throws keyword, it informs the caller of the method that they need to handle or propagate the exception.
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		FileReader file = new FileReader("E:\\WORKSPACE\\FileHandling\\EmpNames.txt");
		System.out.println("File opened successfully");
	}
}
