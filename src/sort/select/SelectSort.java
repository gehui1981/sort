package sort.select;

import java.util.Arrays;

public class SelectSort {
	public static void main(String args[]) {
		int a[] = new int[] { 6, 1, 2, 7, 9, 3, 4, 5, 10, 8, 11, 0, 12, 13, -1 };
		System.out.println(Arrays.toString(a));
		int n = a.length;
		for (int i = 0; i < n - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < n; j++) {
				if (a[minIndex] > a[j]) {
					minIndex = j;
				}
			}
			
			if (i != minIndex) {
				int temp = a[i];
				a[i] = a[minIndex];
				a[minIndex] = temp;
			}
			
			System.out.println(Arrays.toString(a));
		}
		
		System.out.println(Arrays.toString(a));
	}
}
