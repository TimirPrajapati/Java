// Timir Prajapati
// Student ID 202303481
// IN2363-S24-301
// Lab 6
// Aug 11 , 2024
package tim;

public class SortSearch_TIM481 {

	public static void main(String[] args) {
		// Step 1
		System.out.println("intList1_tim481");

		int[] intList1_tim481 = new int[1000];

		// Step 2
		for (int i = 0; i < intList1_tim481.length; i++) {
			intList1_tim481[i] = (int) (Math.random() * 10) + 1;
		}

		// Step 3
		System.out.println("  Index of first value of 3: " + linearSearch(intList1_tim481, 3));

		// Step 4
		System.out.print("  Index values for all locations of 5: ");
		for (int i = 0; i < intList1_tim481.length; i++) {
			if (intList1_tim481[i] == 5)
				System.out.print(i + " ");
		}
		System.out.println();

		// Step 5
		System.out.println("  Sorting intList1_tim481...");
		java.util.Arrays.sort(intList1_tim481);

		// Step 6
		System.out.println("  Index of first value of 3 (linear search): " + linearSearch(intList1_tim481, 3));

		// Step 7
		System.out.println(
				"  Index of first value of 3 (binary search): " + java.util.Arrays.binarySearch(intList1_tim481, 3));

		// Step 8
		System.out.println(
				"  Range if all values of 5 (binary search): " + (java.util.Arrays.binarySearch(intList1_tim481, 4) + 1)
						+ " through " + (java.util.Arrays.binarySearch(intList1_tim481, 6) - 1));

		// Step 9
		System.out.println("doubleList1_tim481:");

		double[][] doubleList1_tim481 = new double[3][6];

		// Step 10
		for (int row = 0; row < doubleList1_tim481.length; row++) {
			for (int col = 0; col < doubleList1_tim481[row].length; col++) {
				doubleList1_tim481[row][col] = (int) (Math.random() * 10) + 1;
			}
		}

		for (int row = 0; row < doubleList1_tim481.length; row++) {
			System.out.print("  ");
			for (int col = 0; col < doubleList1_tim481[row].length; col++) {
				System.out.print(doubleList1_tim481[row][col] + " ");
			}
			System.out.println();
		}

		// Step 11
		double[] results_tim481 = new double[3];

		for (int row = 0; row < doubleList1_tim481.length; row++) {
			for (int col = 0; col < doubleList1_tim481[row].length; col++) {
				results_tim481[row] += doubleList1_tim481[row][col];
			}
		}
		System.out.println("results_tim481:");

		for (int i = 0; i < results_tim481.length; i++) {
			System.out.println("  " + results_tim481[i]);
		}

		// Step 12
		int[][] myMatrix1_tim481 = { { 56, 72, 92, 15, -98 }, { 15, 28, 198, 25, 21 }, { 33, 27, 24, 29, 12 },
				{ 17, 34, 25, 45, 17 }, };

		System.out.println("myMatrix1_tim481 (original):");

		for (int row = 0; row < myMatrix1_tim481.length; row++) {
			System.out.print("  ");
			for (int col = 0; col < myMatrix1_tim481[row].length; col++) {
				System.out.print(myMatrix1_tim481[row][col] + " ");
			}
			System.out.println();
		}

		// Step 13
		for (int i = 0; i < myMatrix1_tim481.length; i++) {
			java.util.Arrays.sort(myMatrix1_tim481[i]);
		}
		System.out.println("myMatrix1_tim481 (sorted):");

		for (int row = 0; row < myMatrix1_tim481.length; row++) {
			System.out.print("  ");
			for (int col = 0; col < myMatrix1_tim481[row].length; col++) {
				System.out.print(myMatrix1_tim481[row][col] + " ");
			}
			System.out.println();
		}

	}

	public static int linearSearch(int[] list, int key) {

		for (int i = 0; i < list.length; i++) {
			if (key == list[i])
				return i;
		}
		return -1;
	}

}
