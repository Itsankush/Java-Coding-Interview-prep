package all;

class A {
	A() {
		System.out.println("in A");
	}

	A(int n) {
		System.out.println("int A int");
	}
}

class B extends A {
	B() {
		System.out.println("in B");
	}

	B(int n) {
		// this() will call default constructor first
		this();
		System.out.println("int B int");
	}
}

public class useOfThisKeyword {

	private int age;
	private String name;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		// call default constructor
		B a = new B();
		// call parameterized and default as well
		B b = new B(3);
		useOfThisKeyword obj = new useOfThisKeyword();
		obj.setAge(20);
		System.out.println(obj.getAge());
		useOfThisKeyword obj1 = new useOfThisKeyword();
		obj1.setAge(30);
		System.out.println(obj1.getAge());
	}

}
