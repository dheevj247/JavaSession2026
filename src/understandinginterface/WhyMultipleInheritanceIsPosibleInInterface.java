package understandinginterface;

public class WhyMultipleInheritanceIsPosibleInInterface {

	// In Java, multiple inheritance is not possible with classes, 
	// but it is possible with interfaces. 
	
	// Scenario 1 : constants: public static final variables
	// Since all the variables in interface are public static final, we can call the variables of interface using interface name, which avoid the ambiguity/confusion for a class to implement/inherit from multiple interfaces
	// Therefore, there will be no abiguity/confusion for a class to implement/inherit from multiple interfaces

	// Scenario 2 : super() statement
	// When we can create constructor in interface, then we will not be able to use super() statement in child class to call the constructor of parent interface.
	// which avoid the ambiguity/confusion for a class to implement/inherit from multiple interfaces

	// Scenario 3 : methods
	// In interface, we can have abstract methods and static concrete methods.
	// Anyway abstract methods are not implemented in interface, so there will be no ambiguity/confusion for a class to implement/inherit from multiple interfaces.
	// static concrete methods are not inherited by child class, so there will be no ambiguity/confusion for a class to implement/inherit from multiple interfaces.
	// but we can still call the static concrete methods of interface using interface name, which avoid the ambiguity/confusion for a class to implement/inherit from multiple interfaces
	
	// Therefore, multiple inheritance is possible in interface in java.
	
}
