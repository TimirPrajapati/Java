class Mobile {
	// Instance variables
	String brand;
	int price;

	public void display() {
		System.out.println(brand + ":" + price);
	}
}

public class InstanceVariableDemo {

	public static void main(String[] args) {
		Mobile obj1 = new Mobile();
		obj1.brand = "Samsung";
		obj1.price = 1600;

		Mobile obj2 = new Mobile();
		obj2.brand = "Apple";
		obj2.price = 1700;
		
		obj1.display();
		obj2.display();
	}
}
