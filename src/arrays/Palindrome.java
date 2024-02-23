package arrays;

public class Palindrome {

	public static void main(String[] args) {
		int n = 999;
		int rev = 0;
		int temp = n;
		while (n != 0) {
			int rem = n % 10; // 9
			rev = rev * 10 + rem; // 0+9=9 , 90+9=99, 99*10+9=999
			n = n / 10; // 99, 9
		}
		if (temp == rev) {
			System.out.println("true");
		} else
			System.out.println("false");
	}

}
