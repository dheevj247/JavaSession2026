package ragini_demo;

import java.util.Scanner;

public class Demo2 {

	public static int sumOfAdd(int num1,int num2) { //methodcreate parameter
		int sum=num1+num2;
		return sum;
	}
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter scan value 1");
		int scanValue1 = scan.nextInt();
		System.out.println("Enter scan value 2");
		int scanValue2 = scan.nextInt();
		
		int storeRetrunValue =sumOfAdd(scanValue1,scanValue2);
		System.out.println("Sum of "+ scanValue1 +" and "+scanValue2+" is "+storeRetrunValue);//input message +
	}

}
