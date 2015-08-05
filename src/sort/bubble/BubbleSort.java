package sort.bubble;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String args[]) {
		int a[] = new int[] { 6, 1, 2, 7, 9, 3, 4, 5, 10, 8, 11, 0, 12, 13, -1 };
		System.out.println(Arrays.toString(a));
		int n = a.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				if (a[j] >= a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}

		System.out.println(Arrays.toString(a));

	}
}
