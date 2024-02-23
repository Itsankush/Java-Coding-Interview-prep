package streams;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class duplicate_char {
	public static void distinct() {
		Stream.of('a', 'n', 'k', 'd', 'a', 'k', 'z', 'b', 'a').distinct().collect(Collectors.toList())
				.forEach(n -> System.out.print(n));
	}
	

	public static void main(String[] args) {

	}

}
