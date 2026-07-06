package wrapperclassconcepts;

public class AutoBoxingAndAutoUnboxing {

	// Wrapper classes are used to convert primitive data types into non-primitive data types & Vice versa
	//Types of Wrapper Classes
	/**
	 * Wrapper Class(Non-Primitive Datatype) --> Primitive Data Type
	 * 1. Integer --> int
	 * 2. Float --> float
	 * 3. Double --> double
	 * 4. Character --> char
	 * 5. Boolean --> boolean
	 * 6. Long --> long
	 * 7. Short --> short
	 * 8. Byte --> byte
	 */
	Object obj = 34; // int converted to Integer & then Integer converted to Object
	Integer i = 34; // int converted to Integer
	int a = 54; // int value in int varaible
	
	//Process of converting primitive data type to non-primitive data type is called as Boxing
	 double d = 34; // widening: int to double, Autotypecasting/implicit typecasting
	 int b = (int) 52.36; // narrowing: double to int, Explicit typecasting
	 
	 //Boxing: Converting primitive data type to non-primitive data type. It is also called as Autoboxing
	 // because it is done automatically/implicitly by the compiler
	 
	 Integer i1 = 34; // int converted to Integer
	 
	//Unboxing: Converting non-primitive data type to primitive data type. It is also called as Auto-unboxing
	int a1 = i1; // Integer object converted to int primitive data type
	
	
}
