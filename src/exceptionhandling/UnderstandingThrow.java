package exceptionhandling;

public class UnderstandingThrow {
	//Throw is used to explicitly create or raise or throw an exception from a method 
	
	public static void main(String[] args) {
		//case 1: when a!=0 or b!=0
		multiply(10,2);
		
		//case 2: when a==0 or b==0
//		multiply(10,0); //method call statement
	}
	
	//create a method using throw keyword to throw an arithmetic exception
	public static void multiply(int a, int b) {
		if(b==0 || a==0) {
			throw new ArithmeticException("Division by zero is not allowed");
		}
		else {
			System.out.println("Result: " + (a/b));
		}
	}

}
