package exceptionhandling;

public class Driver {
	public static void main(String[] args) {
//		StringTestValue test = new StringTestValue();
//		System.out.println("The weather is: " + test.weather);
//		System.out.println("Last character of weather: " + test.weather.charAt(5));
		
		EmployeeForCustomException employee = new EmployeeForCustomException("John", 50000);
		employee.displayEmployeeDetails();
		try {
			employee.addHike(10);
		} catch (SalaryException e) {
			System.out.println("Exception occurred: " + e.getMessage());
		}
		//-----------------
		try {
			employee.addHike(-5);
		} catch (SalaryException e) {
			System.out.println("Exception occurred: " + e.getMessage());
		}
		System.out.println("-----------------------------------");
		System.out.println("Program continues after handling the exception.");
	}
}
