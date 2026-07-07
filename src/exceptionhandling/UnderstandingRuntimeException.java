package exceptionhandling;

//Runtime Exception: Errors/ Issues that occur during the execution of the program
// Due to some logical errors in the code, we get runtime exception.

public class UnderstandingRuntimeException {
	public static void main(String[] args) {
		System.out.println("Start of Program");
		int i = 5;
		int j = 2;
		System.out.println(i + " + " + j + " = " + (i+j));
		
		String str = null;
		System.out.println(str.length()); // This will throw NullPointerException 
		
		System.out.println("End of Program");
	}
}
