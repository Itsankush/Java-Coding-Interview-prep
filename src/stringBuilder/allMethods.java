package stringBuilder;

public class allMethods {

	public static void main(String[] args) {
		String a = "Ankush";
		StringBuilder sb = new StringBuilder(a);
		sb.append(" F");
		// sb.trimToSize();
		sb.toString();
		String newSB = sb.substring(1, 5);
		sb.reverse();
		sb.replace(1, 3, "xy");
		sb.setCharAt(0, 'M');
		// sb.insert(5, sb);
		// IntStream a=sb.chars();
		// a.forEach(n->System.out.println(n));
		// System.out.println(sb.charAt(4));
		 System.out.println(sb);
		 System.out.println(newSB);

		StringBuilder s = new StringBuilder(a);
		System.out.println(s.length());
		s.setCharAt(s.length() - 1, '$');
		System.out.println(s);
	}

}
