package wrapper;

public class Autoboxing_Unboxing {

	public static void main(String[] args) {
		int a = 10;
		// Autoboxing:- Converting primitives into objects
		Integer int_obj = a;
		System.out.println("Object: " + int_obj);

		// Unboxing: Converting Objects to Primitives
		int int_primitive = int_obj;
		System.out.println("Primitive: " + int_primitive);
	}

}
