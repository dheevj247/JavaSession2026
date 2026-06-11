package Object;

public class EmpDriver {

	public static void main(String[] args) {
		Employee emp1 = new Employee(62853,"Suma", 852014);
		System.out.println(emp1);
//		System.out.println(emp1.toString());//internal
		Employee emp2 = new Employee(52648,"Dheeraj", 963215);
		System.out.println(emp2);
		Employee emp3 = new Employee(52648,"Dheeraj", 963215);
		System.out.println(emp3);
		System.out.println(emp1.equals(emp2));
		System.out.println(emp1.equals(emp3));
		System.out.println(emp2.equals(emp3));
		Employee emp4 = new Employee(62853,"Raja", 95231);
		System.out.println(emp1.equals(emp4));
		
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());
		System.out.println(emp3.hashCode());
		System.out.println(emp4.hashCode());


	}

}
