package runtimepolymorphism;

public class DaughterPoly extends FatherPoly {
	
	String bike;
	String car;
	
	public DaughterPoly(String bike, String car) {
		this.bike = bike;
		this.car = car;
	}
	
	//overriding method
	public void display() {
		System.out.println("Daughter's bike is: " + bike);
		System.out.println("Daughter's car is: " + car);
	}
	
}
