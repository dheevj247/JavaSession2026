package understandinginterface;

// implements: it a keyword used to achieve inheritance in java.
// A class can implement/inherit multiple interfaces in java.
public class Child implements Father, Mother {

	// This is a concrete method in Child class, which is implementing the abstract method gift() from both Father and Mother interfaces.
	public void gift() {
		System.out.println("Child's gift: " + Father.gift + " and " + Mother.gift);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Father's gift: " + Father.gift);
		System.out.println("Mother's gift: " + Mother.gift);
		
		Child child = new Child();
		child.gift();
		
		System.out.println("Calling static method");
		Father.display();
		Mother.display();
		
		Father father = new Child();
		father.gift();
		
		Mother mother = new Child();
		mother.gift();
		
		//We trying to create an object of interface Father
		//When creating an object of interface, we will get compile time error as we cannot create an object of interface.
		//Interface will not allow to create constructor, so we cannot create an object of interface.
//		Father father1 = new Father();
	}

}
