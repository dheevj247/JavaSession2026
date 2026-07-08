package understandinginterface;
// Interface is a keyword in Java 
// An interface helps programmers to create non-private data type/ User-defined data type
// An interface is by default abstract and public.
// Since an interface is abstract, it cannot be instantiated.(can not create object of interface)
// An interface can be either public or default. It cannot be private or protected.
// purpose of using interface: 
// 1. To achieve 100% abstraction (non static concrete methods are not allowed)
// 2. To achieve multiple inheritance

public interface Demo {
	// 1. To achieve 100% abstraction in interface, Why?
	//This is a non-static concrete method in interface. It will give compile time error, and suggest to make it either static or abstract
	/*
	 * public void multiply(double a, double b) { 
	 * System.out.println("Product: " + (a * b)); 
	 * }
	 */
	
	// we can have only non-static abstract methods in interface.
	public abstract void display();
	
	//interface introduced lot features in java 8 and above, like static methods, default methods, private methods, private static methods, etc.
	//1. it is by default public static final, so int i; throws CTE: & that is why interface variable must be initialized.
	
	//2. Can we re-assign the value of interface variable? No, because it is final. So, we can not re-assign the value of interface variable.
	int i = 10; // public static final int i = 10;
//	public static void updateStaticVariable() {
//		//i = 20; // CTE: cannot assign a value to final variable i
//	}
	
	//3. Can we create constructor in interface? No, because interface is abstract and cannot be instantiated. So, we can not create constructor in interface.
//	public Demo() {
//		// CTE: Interface Demo cannot have a constructor
//	}
	
	// After java 8, we can have static concrete methods in interface. Static methods are not inherited by the implementing class/sub class, but they can be called using the interface name.
	// They did not allow static concrete methods in interface to inherit in subclass in order to avoid ambiguity/ diamond problem.
	public static void add(int a, int b) {
		System.out.println("Sum: " + (a + b));
	}
	
	
	
	
	
}
