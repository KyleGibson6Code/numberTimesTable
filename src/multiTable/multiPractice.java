package multiTable;

import java.util.Scanner;

public class multiPractice {

	public static void main(String[] args) {

		System.out.println("Enter a number");
		
		int number,multiplier;
		Scanner input= new Scanner(System.in);
		number=input.nextInt();
		input.close();
		
		for( multiplier = 1; multiplier <= 10; multiplier++) {
		
			System.out.printf("%d * %d * %d\n", number, multiplier, (number * multiplier) );
		
	}

}
}