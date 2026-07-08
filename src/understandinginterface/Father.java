package understandinginterface;

public interface Father {
	//public static final variable
	String gift = "Car";
	
	abstract public void gift();
	
	public static void display() {
		System.out.println("Father's gift: " + gift);
	}
}
