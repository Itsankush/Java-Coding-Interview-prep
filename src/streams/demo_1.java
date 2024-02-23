package streams;

import java.util.Arrays;
import java.util.List;

public class demo_1 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("a1", "a2", "b1", "c3", "c5");
		list.stream().filter(n -> n.startsWith("c")).map(n -> n.toUpperCase()).forEach(System.out::println);
		list.stream().filter(n -> n.startsWith("c")).map(n -> n.toUpperCase()).forEach(n->System.out.println(n));
	}

}
