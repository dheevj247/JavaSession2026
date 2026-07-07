package suma_employeearraydesign;

public class EmployeeDriver {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.createEmployee("Suma", 413032, 8522330,"Tester");
		emp1.assignEmployeeToGivenArrayIndex(2, emp1);
		Employee emp2 = new Employee();
		emp2.createEmployee("Anitha", 75121, 415457,"Developer");
		emp2.assignEmployeeToGivenArrayIndex(4, emp2);
		emp2.deleteEmployeeFromArray(2);
	}

}
