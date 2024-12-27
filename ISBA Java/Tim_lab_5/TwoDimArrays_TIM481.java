// Timir Prajapati
// Student ID 202303481
// IN2363-S24-301
// Lab 5
// Due July 28, 2024

package tim;

public class TwoDimArrays_TIM481 {

	public static void main(String[] args) {
		// Steps 1 - 3 :
		int[][] intList1_TIM481;
		intList1_TIM481 = new int[7][5];

		for (int col = 0; col < 5; col++) {
			intList1_TIM481[0][col] = 33;
			intList1_TIM481[1][col] = 33;
			intList1_TIM481[2][col] = 33;
			intList1_TIM481[4][col] = 33;
		}
		System.out.println("Step 1 - 3 : intList1_TIM481:");

		for (int row = 0; row < 7; row++) {
			for (int col = 0; col < 5; col++) {
				System.out.print(intList1_TIM481[row][col] + " ");
			}
			System.out.println();
		}
		System.out.println();

		// Steps 4 - 6:
		double[][] doubleList2_TIM481 = new double[3][7];

		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 7; col = col + 2) {
				doubleList2_TIM481[row][col] = 55;
			}
		}
		System.out.println("Step 4 - 6 : doubleList2_TIM481:");

		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 7; col++) {
				System.out.print(doubleList2_TIM481[row][col] + " ");
			}
			System.out.println();
		}
		System.out.println();

		// Step 7 - 9 :
		String[][] StringList3_TIM481 = new String[5][7];

		StringList3_TIM481[3][0] = "Sunday";
		StringList3_TIM481[3][1] = "Monday";
		StringList3_TIM481[3][2] = "Tuesday";
		StringList3_TIM481[3][3] = "Wednesday";
		StringList3_TIM481[3][4] = "Thursday";
		StringList3_TIM481[3][5] = "Friday";
		StringList3_TIM481[3][6] = "Saturday";

		System.out.println("Step 7 - 9 : StringList3_TIM481:");

		for (int col = 0; col < 7; col++) {
			System.out.print(StringList3_TIM481[3][col] + " ");
		}
		System.out.println();
		System.out.println();

		// Step 10 :
		int[][] intList4_TIM481 = new int[4][4];

		for (int row = 0; row < 4; row++) {
			for (int col = 0; col < 4; col++) {
				intList4_TIM481[row][col] = 2;
			}
		}
		System.out.println("Step 10: intList4_TIM481:");

		for (int row = 0; row < 4; row++) {
			for (int col = 0; col < 4; col++) {
				System.out.print(intList4_TIM481[row][col] + " ");
			}
			System.out.println();
		}
		System.out.println();

		// Step 11:
		boolean[][] boolList5_TIM481 = new boolean[6][8];

		// Step 12:
		int[][] myArray1_TIM481 = { { 56, 72, 92, 15, -98 }, { 16, 28, 198, 25, 21 }, { 33, 27, 24, 29, 12 },
				{ 17, 34, 25, 45, 17 } };

		System.out.println("Step 12: myArray1_TIM481:");

		for (int row = 0; row < 4; row++) {
			for (int col = 0; col < 5; col++) {
				System.out.print(myArray1_TIM481[row][col] + " ");
			}
			System.out.println();
		}
		System.out.println();

		// Step 13:
		boolean[][] myArray2_TIM481 = new boolean[3][3];
		
		System.out.println("Step 13: myArray2_TIM481:");

		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++) {
				System.out.print(myArray2_TIM481[row][col] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		// Step 14:
		boolean[][] myArray3_TIM481 = new boolean[12][3];
		
		for (int row = 0; row < 12; row++) {
			for (int col = 0; col < 3; col++) {
				myArray3_TIM481[row][col] = true;
			}
		}
		System.out.println("Step 14: myArray3_TIM481:");

		for (int row = 0; row < 12; row++) {
			for (int col = 0; col < 3; col++) {
				System.out.print(myArray3_TIM481[row][col] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		// Step 15: 
		String[][] myArray4_TIM481 = {
				{"First", "Last","Middle", "Phone", "City", "Province" },
				{"Louise", "Smith", "Eva", "555-8234", "Kingsville", "AB"},
				{"Ravinder", "Kaur", "Lovepreet", "555-8713", "Timmins", "ON"}
		};
		System.out.println("Step 15: myArray4_TIM481:");

		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 6; col++) {
				System.out.print(myArray4_TIM481[row][col] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

}
