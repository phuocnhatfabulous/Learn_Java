//This task is practice about operators; if...else; Iteration

import java.util.Scanner;

public class task2 {
	//Method function 
	public static void OperatorValue() {
		
		byte z = 127; //Size 1 byte
		short a = 32767; //Size 2 bytes 
		int b = 217483674; //Size 4 bytes 
		float x = 2.77f; //Size 4 bytes 
		double y = 3.23; //Size 8 bytes 
		System.out.println("Value --z is: " + --z);
		System.out.println("Value a-- is: " + a--);
		System.out.println("Value ++y is: " + ++y);
		System.out.println("Value x++ is: " + x++);
		String value = ( x > y ) ? "Good morning" : "Good bye"; //If...else
		System.out.println(value);
	}
	public static void Iteration() {
		
		Scanner input = new Scanner(System.in);
		System.out.println("How old are you? : ");
		int age = input.nextInt();
		
		do {
			System.out.println("Verify your age: ");
			age = input.nextInt();
		}
		while(age > 110);
	}
	public static void Iteration2() {
		
		//Syntax 1:
		String[] fruit = {"Banana", "Apple", "Mango", "WaterMelon", "Orange" };
		for ( String i : fruit ) {
			System.out.println(i);
		}
		//Syntax 2:
		for (int i = 0; i <= 5; i++) {
			System.out.println(i);
		}
	}
	
	public static void ShowConstantsValue() {
		
		final float PI = 3.14f ;// declare constants
		//Or final double PI = 3.14;
		System.out.println(PI);
	}
	//Main function 
	public static void main(String[] args ) {
		OperatorValue();
		ShowConstantsValue();
		Iteration();
		Iteration2();
	}
}
