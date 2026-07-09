package complietimepolymorphsimvariableshadowing;

public class MethodOverloading {
	void add(int a, int b) {   //method created which accepts two parameters
		System.out.println("Sum = " + (a + b));
	}
	void add(int a, int b, int c) {
		System.out.println("Sum = " + (a + b + c));
	}

	public static void main(String[] args) {

		MethodOverloading add = new MethodOverloading();

		add.add(10, 20);  //calling the method by reference of object non static methods
		add.add(10, 20, 30);
	}
}


