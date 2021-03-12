import java.util.Random;
import java.util.Scanner;

public class Loop {
	
	public static void main(String[] args) {
//		Random rd = new Random();
//		int x = rd.nextInt();
//		System.out.println(x); 
		
		Scanner input = new Scanner(System.in);
		String name = "";
		while(name.isBlank()) {
			System.out.println("Enter your name: ");
			name = input.nextLine();
		}
		// or do like that
//		do {
//			System.out.println("Enter your name: ");
//			name = input.nextLine();
//		}while(name.isBlank());
		
		//a loop inside of a loop
		int rows;
		int column;
		String symbol = "";
		
		System.out.println("Enter symbol of rows: ");
		rows = input.nextInt();
		
		System.out.println("Enter symbol of colunms: ");
		column = input.nextInt();
		
		System.out.println("Enter symbol to use: ");
		symbol = input.next();
		
		for(int i = 1; i <= rows; i++) {
			System.out.println();
			for(int j = 1; j<=column; j++) {
				 System.out.print(symbol);
			}
		}		
	}
}
