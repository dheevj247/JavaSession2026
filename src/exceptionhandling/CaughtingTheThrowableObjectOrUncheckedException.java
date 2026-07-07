package exceptionhandling;

public class CaughtingTheThrowableObjectOrUncheckedException {
	public static void main(String[] args) {
		try {
			System.out.println("Start of Program");
			int i = 5;
			int j = 2;
			System.out.println(i + " + " + j + " = " + (i+j));
			
			String str = null;
			System.out.println(str.length()); 
			
			System.out.println("End of Program");
		} catch (Throwable t) {
			System.out.println("Exception Occurred: " + t.getMessage());
		}
		System.out.println("Program continues after exception handling");
	}
}
