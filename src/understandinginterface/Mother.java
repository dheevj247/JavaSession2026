package understandinginterface;

public interface Mother {
	//public static final variable
	String gift = "Jewelry";
	
	abstract public void gift();
	
	//static concrete method in interface
	public static void display() {
		System.out.println("Mother's gift: " + gift);
	}
}
