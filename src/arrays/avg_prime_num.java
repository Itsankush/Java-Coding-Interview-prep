package arrays;

//average of prime numbers
import java.util.ArrayList;
import java.util.List;

public class avg_prime_num {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();

		for (int n = 2; n < 10; n++) {
			boolean flag = true;

			for (int i = 2; i < n; i++) {

				if (n % i == 0) {
					flag = false;
					break;
				}
			}
			if (flag) {
				list.add(n);
			}
		}
		System.out.println(list);
		int total = list.size();
		int sum = 0;
		for (int n = 0; n < list.size(); n++) {
			sum = sum + list.get(n);
		}
		float avg = (float) sum / total;
		System.out.println(sum);
		System.out.println(total);
		System.out.println(avg);
	}

}
