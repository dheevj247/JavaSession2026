package exceptionhandling;

public class SalaryException extends ArithmeticException {
	
	public String getMessage() {
		return "Salary cannot be less than 0. Please enter a valid salary.";
	}
}
