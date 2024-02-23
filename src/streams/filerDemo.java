package streams;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class filerDemo {

	static void filterDemo_1() {
		Stream.of(1, 2, 3, 4).filter(n -> n % 2 == 0).collect(Collectors.toList()).forEach(n -> System.out.print(n));
	}

	static void filterDemo_2() {
		Stream.of('f', 'b', 'c', 'f').map(n -> n.toUpperCase(n)).collect(Collectors.toList())
				.forEach(n -> System.out.print(n));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		filterDemo_1();
		System.out.println();
		filterDemo_2();
	}

}
