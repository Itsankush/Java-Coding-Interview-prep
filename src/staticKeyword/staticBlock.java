package staticKeyword;

public class staticBlock {

	static String brand;
	static int camera;
	String model;
	int price;
	// Static block is used to initiate static variables
	static {
		brand = "apple";
		camera = 2;
		System.out.println("Inside Static block");
	}

	public staticBlock() {
		model = "Iphone3";
		price = 5000;
	}

	void show() {
		System.out.println(brand + " : " + model + " : " + price + " : " + camera);
	}

	public static void main(String[] args) {
		staticBlock sb = new staticBlock();
		sb.model = "s50";
		sb.price = 1000;
		sb.show();
		// staticBlock sb1 = new staticBlock();

		// sb1.show();
	}

}
