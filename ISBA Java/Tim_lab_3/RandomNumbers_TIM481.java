// Timir Prajapati
// Student ID 202303481
// IN2363-S24-301
// Lab 3
// Due June 16, 2024
package tim;

public class RandomNumbers_TIM481 {

	public static void main(String[] args) {
		// Initialize variables
		int randomNumber_tim481;
		int numberOf0s_tim481 = 0;
		int numberOf1s_tim481 = 0;
		int numberOf2s_tim481 = 0;
		int numberOf3s_tim481 = 0;
		int numberOf4s_tim481 = 0;

		// Generate 500 random numbers and update counters
		for (int i = 0; i < 500; i++) {
			// Generate a random integer from 0 to 4
			randomNumber_tim481 = (int) (Math.random() * 5);

			// Update counters
			switch (randomNumber_tim481) {
			case 0:
				numberOf0s_tim481++;
				break;
			case 1:
				numberOf1s_tim481++;
				break;
			case 2:
				numberOf2s_tim481++;
				break;
			case 3:
				numberOf3s_tim481++;
				break;
			case 4:
				numberOf4s_tim481++;
				break;

			}
		}

		// Display results
		System.out.println("Random number stats");
		System.out.println("After 500 rolls, the stats are:");
		System.out.println("The number of 0 was rolled " + numberOf0s_tim481 + " times.");
		System.out.println("The number of 1 was rolled " + numberOf1s_tim481 + " times.");
		System.out.println("The number of 2 was rolled " + numberOf2s_tim481 + " times.");
		System.out.println("The number of 3 was rolled " + numberOf3s_tim481 + " times.");
		System.out.println("The number of 4 was rolled " + numberOf4s_tim481 + " times.");
	}

}
