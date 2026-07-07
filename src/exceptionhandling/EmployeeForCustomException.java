package exceptionhandling;

public class EmployeeForCustomException {
	private String name;
	private double salary;
	
	public EmployeeForCustomException(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public void displayEmployeeDetails() {
		System.out.println("Adding details of employee:");
		System.out.println("Employee Name: " + name);
		System.out.println("Employee Salary: " + salary);
		System.out.println("Added employee details successfully.");
		System.out.println("-----------------------------------");
	}
	
	/**
	 * Description: This method adds a hike to the employee's salary based on the provided hike percentage.
	 * @param hikePercentage
	 */
	public void addHike(double hikePercentage) {
		if (hikePercentage <= 0) {
			throw new SalaryException();
		} else {
			System.out.println("Adding hike of " + hikePercentage + "% to employee salary.");
			salary += salary * (hikePercentage / 100);
			System.out.println("Hike added successfully.");
			System.out.println("Updated Employee Salary: " + salary);
			System.out.println("-----------------------------------");
		}
	}
}
