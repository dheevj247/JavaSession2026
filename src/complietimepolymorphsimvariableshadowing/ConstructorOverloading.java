package complietimepolymorphsimvariableshadowing;

public class ConstructorOverloading {
	//If a class has more than one method or a constructor with the same name but different signature, 
	//it is known as method overloading or constructor overloading.

	ConstructorOverloading () {
		System.out.println("Default Constructor"); // o/p > Default Constructor
	}

	ConstructorOverloading (String name) {
		System.out.println("Student Name: " + name); // o/p >  Student Name: Ragini
	}

	ConstructorOverloading(String name, int age) {
		System.out.println("Student Name: " + name);
		System.out.println("Age: " + age); //  o/p > Student Name: Ragini: 33
	}


	public static void main(String[] args) {

		ConstructorOverloading  s1 = new ConstructorOverloading ();
		ConstructorOverloading s2 = new ConstructorOverloading ("Ragini");
		ConstructorOverloading  s3 = new ConstructorOverloading ("Ragini: " + 33);
	}

	

}
