package Object;

public class Employee {

	//	Employee class ,eid, ename,salary
	//	parameterized contructor
	//	override below methods equals,toString,hashcode

	int eid;
	String ename;
	double salary;

	public Employee(int eid,String ename,double salary) {
		this.eid = eid;
		this.ename=ename;
		this.salary=salary;

	}
	
	public String toString(){
		return "Employee ID: " + eid + " Employee Name: " + ename + " Salary : " +salary;
		
	}
	public boolean equals(Object obj) {
		Employee emp = (Employee) obj; // downcasting
		return this.eid == emp.eid && this.ename == emp.ename && this.salary == emp.salary;
		
	}
	public int hashCode()
	{
		int hc = 0;
		hc = hc+eid;
		hc = hc + ename.hashCode();//converting string into int
		hc = hc+((int)salary);
		return hc;
	}


}
