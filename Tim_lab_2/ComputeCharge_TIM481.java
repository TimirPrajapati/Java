// Timir Prajapati
// Student ID 202303481
// IN2363-S24-301
// Lab 2
// Due June 2, 2024
package tim;

import java.util.Scanner;

public class ComputeCharge_TIM481 {

	public static void main(String[] args) {
		// Create a scanner
		Scanner input_tim481 = new Scanner(System.in);

		double weight_tim481 = 0.0;

		while (weight_tim481 < 0.1 || weight_tim481 > 30.0) {
			// Receive the input
			System.out.print("What is the weight of the package (in pounds): ");
			weight_tim481 = input_tim481.nextDouble();

			// Display results
			if (weight_tim481 < 0.1) {
				System.out.println("Error: Invalid Input.");
			} else if (weight_tim481 >= 0.1 && weight_tim481 <= 1.0) {
				System.out.println("The cost of shipping is $2.25.");

			} else if (weight_tim481 >= 1.1 && weight_tim481 <= 5.0) {
				System.out.println("The cost of shipping is $5.75.");

			} else if (weight_tim481 >= 5.1 && weight_tim481 <= 15.0) {
				System.out.println("The cost of shipping is $7.50.");

			} else if (weight_tim481 >= 15.1 && weight_tim481 <= 30.0) {
				System.out.println("The cost of shipping is $10.25.");

			} else {
				System.out.println("The package is too heavy and cannot be shipped.");
			}
		}
	}

}
