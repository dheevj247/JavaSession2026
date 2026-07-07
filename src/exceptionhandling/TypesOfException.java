package exceptionhandling;

import java.io.FileReader;

public class TypesOfException {
	public static void main(String[] args) {
		//Types of Exception
		//1. Checked Exception: Compile time exception
		//2. Unchecked Exception: Runtime exception
		//Example for Checked Exception: Compile time exception
		try {
			FileReader file = new FileReader("E:\\WORKSPACE\\FileHandling\\EmpNames.txt");
			System.out.println("File opened successfully");
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("File not found");
		}
		System.out.println("End of Program");
	}
}
