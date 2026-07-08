package suma_employeearraydesign;

public class Employee {
	String ename;
	int eid;
	double salary;
	String designation;

	// Creating a Static Employee Array.
	public static Employee[] emparr= new Employee[5];

	/**
	 * Discription : Method to create an employee
	 * Author : Suma
	 * Date of Creation : 27-06-2026
	 * Modified by : 
	 */
	public void createEmployee(String ename, int eid,double salary,String designation ) {
		this.ename = ename;
		this.eid = eid;
		this.salary = salary;
		this.designation = designation;
	}

	/**
	 * Discription : Assigning employee into array
	 * Author : Suma
	 * Date of Creation : 27-06-2026
	 * Modified by : 
	 */
	public void assignEmployeeToGivenArrayIndex(int index, Employee emp) {
		emparr[index] = emp;
	}
	/**
	 * Discription : Update salary
	 * Author : Suma
	 * Date of Creation : 27-06-2026
	 * Modified by : 
	 */
	public void updateSalary(double salary) {
		this.salary = salary;
	}
	/**
	 * Discription : Delete employee from array
	 * Author : Suma
	 * Date of Creation : 27-06-2026
	 * Modified by : 
	 */
	public void deleteEmployeeFromArray(int index) {
		emparr[index] = null;	
	}
}
