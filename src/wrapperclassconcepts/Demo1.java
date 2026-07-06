package wrapperclassconcepts;

import java.util.Scanner;

import understandingarray.Employee;

public class Demo1 {

	public static void main(String[] args) {
		int age = 25; // primitive data type
		System.out.println("Age: " + age);
		
		/*
		 * Non -primitive data type : String Array Scanner Object UserDefinedClass
		 */
		Object obj = new Employee(); // non-primitive data type
		Object obj1 = new String("Hello"); // non-primitive data type
		Object obj2 = new int[5]; // non-primitive data type
		Object obj3 = new Scanner(System.in); // non-primitive data type
		
		//Object is a generalized class which can hold any type of non-primitive data type
		Object obj4 = 34; //Conversion of primitive data type to non-primitive data type with the help of wrapper classes
	}
}
