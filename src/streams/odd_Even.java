package streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class odd_Even {

	static void odd_even() {
		List<Integer> even = Stream.of(1, 8, 50, 4, 3, 8, 10, 12).filter(n -> n % 2 == 0).collect(Collectors.toList());
		System.out.println("Even:- " + even);
		List<Integer> odd = Stream.of(1, 8, 50, 4, 3, 8, 10, 12).filter(n -> n % 2 != 0).collect(Collectors.toList());
		System.out.println("Odd:- " + odd);
	}

	public static void main(String[] args) {
		odd_even();

	}

}
