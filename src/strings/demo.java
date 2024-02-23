package strings;

public class demo {

	public static void main(String[] args) {
		String a = "Ankush";
		String c = "Ankush";
		String b = new String("Ankush");
		String d = new String("Ankush");
		
		System.out.println(a.hashCode());
		System.out.println(c.hashCode());
		System.out.println(b.hashCode());
		System.out.println(d.hashCode());
	}

}
