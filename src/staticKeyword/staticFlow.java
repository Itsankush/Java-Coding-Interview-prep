package staticKeyword;

public class staticFlow {

	int a = 1;
	static String clg = "SMD";

	void getMeta() {
		System.out.println("Hello ");
	}

	void getData() {
		String clg = "BVCOENM";
		System.out.println(clg);
		this.getMeta();
		System.out.println(this.a);
	}

	public static void main(String[] args) {
		staticFlow sf = new staticFlow();
		sf.getData();
		System.out.println(staticFlow.clg);
	}

}
