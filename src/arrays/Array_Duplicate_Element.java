package arrays;

//find repeated elements with count
public class Array_Duplicate_Element {
	public static void main(String[] args) {
		
		int[] a = { 1, 3, 5, 2, 1, 3, 5, 8, 9, 8, 10, 10, 11 };
		int k = 0;
		
		for (int i = 0; i < a.length; i++) {
			k = 1;
			
			for (int j = i + 1; j < a.length; j++) {
				
				if (a[i] == a[j]) {
					k++;
					// System.out.println(a[j]);
				}
			}
			if (k > 1) {
				System.out.println(a[i] + " this element repated " + k + " times");
				k = 0;
			}
		}
	}
}
