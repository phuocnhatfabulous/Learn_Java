
//This task is practice about array in Java

import java.util.Scanner;

public class task3 {
	final int MAX = 100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int[] amount = new int [100]; //Declare arrays 
		System.out.println("How many siblings are there in family: \t ");
		int x = Integer.parseInt(input.nextLine());  //Type conversion
		for( int i = 0; i < x ; i++) {
			System.out.println("who: ");
			String who = input.nextLine();
			} 
	}
}
