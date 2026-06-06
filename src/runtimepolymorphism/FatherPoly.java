package runtimepolymorphism;

public class FatherPoly {
	
	String bike;
	
	public FatherPoly() {
		
	}
	
	public FatherPoly(String bike) {
		this.bike = bike;
	}
	
	//overridden method
	protected void display() {
		System.out.println("Father's bike is: " + bike);
	}
}
