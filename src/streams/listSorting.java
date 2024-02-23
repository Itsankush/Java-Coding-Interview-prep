package streams;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class listSorting {

	static void forEach(List<String> day) {
		day.stream().sorted().forEach(d -> System.out.println(d));
	}

	static void collect(List<String> day) {
		List<String> sortedday = day.stream().sorted().collect(Collectors.toList());

		System.out.println(sortedday);
	}

	static void filterExample() {
		Stream.of("ankush", "sam", "jin").filter(n -> n.startsWith("s")).collect(Collectors.toList())
				.forEach(s -> System.out.println(s));
	}

	static void mapExample() {
		Stream.of(1, 2, 3, 4).filter(n -> n%2==0).
		collect(Collectors.toList())
				.forEach(s -> System.out.println(s));
	}

	public static void main(String[] args) {
		// String[] a = { "monday", "tuesday", "wednesday", "thursday", "friday" };
		// List<String> day = Arrays.asList(a);
		mapExample();
		// sortList_1(day);
		// sortList_2(days);

	}

}
