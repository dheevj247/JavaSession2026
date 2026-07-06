package ragini_employeearray;

public class Employee {

	String eName;
	int eId;
	double eSalary;
	String eDesignation;
	
	// creating static employee array
	public static Employee[] emparr = new Employee[5]; //static array of obj created for size[5)
	
	/**
	 * Description : Method to create an employee
	 * Author : Ragini V 
	 * Date Of Creation : 27-06-2026
	 * Modified By :
	 */
	public void createEmployee(String eName,int eId,double eSalary,String eDesignation) {
		this.eName =eName;
		this.eId = eId;
		this.eSalary = eSalary;
		this.eDesignation = eDesignation;	
	}
	/**
	 * Description : Assingning Employee  into  the Array  
	 * Author : Ragini V 
	 * Date Of Creation : 27-06-2026
	 * Modified By :
	 */
	public void assignEmployeeToGivenArrayIndex(int index, Employee emp) {
		emparr[index] = emp;
	}
	/**
	 * Description : Update Salary
	 * Author : Ragini V 
	 * Date Of Creation : 27-06-2026
	 * Modified By :
	 */
	public void updateSalary(double esalary) {
		this.eSalary = eSalary;	
	}
	/**
	 * Description : Delete Employee From An Array
	 * Author : Ragini V 
	 * Date Of Creation : 27-06-2026
	 * Modified By :
	 */
	public void deleteEmployeeFromArray(int index) {
		emparr[index] = null;
	}

}
