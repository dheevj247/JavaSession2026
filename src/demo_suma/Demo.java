package demo_suma;

import java.util.Scanner;

public class Demo {

	public static boolean evenOdd(int num){
		boolean flag = num % 2 == 0 ? true : false;
		return flag;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Scan Value");
		int scanIntValue = scanner.nextInt();  
		boolean returnValue = evenOdd(scanIntValue);
		if(returnValue) {
			System.out.println("Number is Even");
		} else {
			System.out.println("Number is odd");
		}
	}
}



















