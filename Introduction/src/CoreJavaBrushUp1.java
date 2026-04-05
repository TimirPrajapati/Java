
public class CoreJavaBrushUp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int myNum = 5;
		String myName = "Jack";
		char myLetter = 'J';
		double myDecimalNum = 5.99;
		float pi = 3.14f;
		boolean myResult = true;

		System.out.println(myNum + " This is my Number");
		System.out.println(myName);
		System.out.println(myLetter);
		System.out.println(myDecimalNum);
		System.out.println(pi);
		System.out.println(myResult);

		int[] arr = new int[5]; // only declare the array to store 5 int value.
		arr[0] = 1; // we assign the value here and initialize.
		arr[1] = 2; // we assign the value here and initialize.
		arr[2] = 3; // we assign the value here and initialize.
		arr[3] = 4; // we assign the value here and initialize.
		arr[4] = 5; // we assign the value here and initialize.

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}

		int[] ar = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]);
		}

		String[] name = {"Jack","Maa","Bill","Bob"};
		for (int i=0; i<name.length; i++) {
			System.out.println(name[i]);
		}
		
		for (String Sname: name) {
			System.out.println(Sname);
		}
	}

}
