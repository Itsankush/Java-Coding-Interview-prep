package abstraction;

//This class hold sensitive data and we don't want to give direct access to all. This is encapsulation
class capsule {
	private String name;
	private int age;

	public capsule() {// parameterized constructor
		name = "abc";
		age = 10;
	}

	public capsule(int age) { // default constructor

		this.age = age;
	}

	// Getter and Setter methods
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

public class encapsulation {

	public static void main(String[] args) {
		capsule c = new capsule();
		c.setAge(20);
		System.out.println(c.getAge());
		capsule c1 = new capsule();
		c1.setAge(30);
		System.out.println(c1.getAge());
		capsule c2 = new capsule();
		// default constructor call
		System.out.println(c2.getAge());
		// parameterized constructor call
		capsule c3 = new capsule(50);
		System.out.println(c3.getAge());
	}

}
