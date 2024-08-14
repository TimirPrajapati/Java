// Timir Prajapati
// Student ID 202303481
// IN2363-S24-301
// Lab 4
// Due July 14, 2024
package tim;

import java.util.Scanner;

public class SecretNumberGame_TIM481 {

	public static void main(String[] args) {
		boolean keepPlaying_tim481 = true;

		while (keepPlaying_tim481) {
			// Ask for a secret number
			String secretNumber_tim481 = getSecretNumber_tim481(
					"Please provide a secret number that is 6 digit in length. The secret number 000678 is allowed.: ");

			// Print a spoiler message
			System.out.println("Yhh! Your secret number is " + secretNumber_tim481);

			boolean correctGuess_tim481 = false;

			while (!correctGuess_tim481) {
				// Ask for guess
				String guess_tim481 = getSecretNumber_tim481("What is your guess? ");

				if (guess_tim481.equals(secretNumber_tim481)) {
					// Print congratulation message
					System.out.println("CONGRATULATION, you have guess the secret number " + secretNumber_tim481 + ".");
					correctGuess_tim481 = true;
				} else {
					// Creating string to partial match key
					String partialMatch_tim481 = "";

					// Assemble partial match string
					for (int i = 0; i < 6; i++) {
						char guessChar_tim481 = guess_tim481.charAt(i);
						char secretChar_tim481 = secretNumber_tim481.charAt(i);

						if (guessChar_tim481 == secretChar_tim481) {
							partialMatch_tim481 = partialMatch_tim481 + guessChar_tim481;
						} else {
							partialMatch_tim481 = partialMatch_tim481 + "X";
						}
					}

					System.out.println("Partial match: " + partialMatch_tim481);

					// Display clues
					for (int i = 0; i < 6; i++) {
						char guessChar_tim481 = guess_tim481.charAt(i);
						if (guessChar_tim481 == secretNumber_tim481.charAt(i)) {
							System.out.println(
									"The number " + guessChar_tim481 + " at location " + (i + 1) + " is correct.");
						}else if (secretNumber_tim481.indexOf(guessChar_tim481) == -1) {
							System.out.println("The number " + guessChar_tim481 + " is not in the secret number.");
							
						}else {
							System.out.println("The number " + guessChar_tim481 + " is in the secret number but not at location " + (i+1) + ".");
						}
					}
				}

			}

			// Ask whether to continue playing
			keepPlaying_tim481 = continuePlaying_tim481();

		}
		System.out.println("Goodbye!");

	}

	public static String getSecretNumber_tim481(String prompt_tim481) {
		// Create a scanner
		Scanner input_tim481 = new Scanner(System.in);
		System.out.print(prompt_tim481);

		while (true) {
			// Receive the input
			String secretNumber_tim481 = input_tim481.nextLine();

			// Verify the length of secret number
			if (secretNumber_tim481.length() == 6) {
				// Confirm that only digits are used
				boolean valid_tim481 = true;

				for (int i = 0; i < 6; i++) {
					if (!Character.isDigit(secretNumber_tim481.charAt(i))) {
						valid_tim481 = false;
					}
				}

				if (valid_tim481) {
					return secretNumber_tim481;
				} else {
					System.out.print(
							"Please provide a secret number that only uses digits (0123456789). The secret number 000678 is allowed.: ");
				}
			} else {
				System.out.print(
						"Please provide a secret number that is 6 digit in length. The secret number 000678 is allowed.: ");
			}
		}

	}

	public static boolean continuePlaying_tim481() {
		// Create a scanner
		Scanner input_tim481 = new Scanner(System.in);

		while (true) {
			// Receive the input
			System.out.print("Do you want to play again? ");
			String keepPlaying_tim481 = input_tim481.nextLine();

			if (keepPlaying_tim481.equalsIgnoreCase("YES")) {
				return true;
			} else if (keepPlaying_tim481.equalsIgnoreCase("QUIT")) {
				return false;
			}
		}
	}

}
