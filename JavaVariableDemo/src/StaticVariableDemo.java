public class StaticVariableDemo {

	// static variable
	static int age;

	public static void main(String[] args) {
		StaticVariableDemo s1 = new StaticVariableDemo();
		StaticVariableDemo s2 = new StaticVariableDemo();

		s1.age = 24;
		s2.age = 26;

		System.out.println("s1\'s age is : " + s1.age);
		System.out.println("s2\'s age is : " + s2.age);
	}

}
