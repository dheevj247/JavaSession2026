package understandinginterface;

public abstract class Demo2 {
	// An abstract class can not have static abstract method.
	// Example: 	public abstract static void display(); // CTE
	
	// Abstract methods are meant to be overridden in subclasses, 
	// so that is why java designed for us to create non-static abstract methods only in abstract class
	
	// This is a non-static abstract method.
	public abstract void display();
	
	// This is a static concrete method.
	public static void add(int a, int b) {
		System.out.println("Sum: " + (a + b));
	}
	
	//This is a non-static concrete method.
	public void multiply(double a, double b) {
		System.out.println("Product: " + (a * b));
	}
	
	static int i = 10; // public static int i = 10;
	String name = "Java"; // instance variable, can be re-assigned
	
	public static void updateStaticVariable() {
		i = 20; // re-assigning the value of static variable
	}

	// No argument constructor
	// It is not mandatory to create constructor in abstract class, because java compiler will create default constructor for us if we don't create any constructor in abstract class.
	// therefore, we can create constructor in abstract class.
	public Demo2() {
		
	}
}
