package runtimepolymorphism;

public class Driver {

	public static void main(String[] args) {

		FatherPoly father = new DaughterPoly("Yamaha Rx135", "Mahindra Thar");
		//Parent class reference = new Child class object created
		//implicit upcasting
		
		father.display();

	}

}
