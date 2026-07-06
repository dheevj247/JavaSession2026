package ragini_employeearray;

public class Employee_Driver {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.createEmployee("Rajesh", 134578, 60000, "QA");
		emp1.assignEmployeeToGivenArrayIndex(2, emp1);
		Employee emp2 = new Employee();
		emp2.createEmployee("Rani", 456790, 10000, "TeleCaller");
		emp2.assignEmployeeToGivenArrayIndex(3, emp2);
		emp2.deleteEmployeeFromArray(2);
	}

}
