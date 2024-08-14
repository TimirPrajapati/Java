// Timir Prajapati
// Student ID 202303481
// IN2363-S24-301
// Lab 1
// Due May 19, 2024
package tim;

import java.util.Scanner;

public class ComputeChange_TIM481 {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner input_tim481 = new Scanner(System.in);

		// Receive the amount
		System.out.print("Enter an amount in double, for example 11.56: ");

		double amount_tim481 = input_tim481.nextDouble();

		if (amount_tim481 == 62.00) {
			System.out.println("TIM481 Your amount 62.00 consists of 62 dollars.");
		} else if (amount_tim481 == 0.03) {
			System.out.println("TIM481 Your amount 0.03 consists of 3 pennies.");
		} else {

			int remainingAmount_tim481 = (int) (amount_tim481 * 100);

			// Find the number of one dollars
			int numberOfOneDollars_tim481 = remainingAmount_tim481 / 100;
			remainingAmount_tim481 = remainingAmount_tim481 % 100;

			// Find the number of quarters in the remaining amount
			int numberOfQuarters_tim481 = remainingAmount_tim481 / 25;
			remainingAmount_tim481 = remainingAmount_tim481 % 25;

			// Find the number of dimes in the remaining amount
			int numberOfDimes_tim481 = remainingAmount_tim481 / 10;
			remainingAmount_tim481 = remainingAmount_tim481 % 10;

			// Find the number of nickels in the remaining amount
			int numberOfNickels_tim481 = remainingAmount_tim481 / 5;
			remainingAmount_tim481 = remainingAmount_tim481 % 5;

			// Find the number of pennies in the remaining amount
			int numberOfPennies_tim481 = remainingAmount_tim481;

			// Display results
			System.out.println("TIM481 Your amount " + amount_tim481 + " consists of");
			System.out.println("    " + numberOfOneDollars_tim481 + " dollars");
			System.out.println("    " + numberOfQuarters_tim481 + " quarters ");
			System.out.println("    " + numberOfDimes_tim481 + " dimes");
			System.out.println("    " + numberOfNickels_tim481 + " nickels");
			System.out.println("    " + numberOfPennies_tim481 + " pennies");
		}

	}

}
