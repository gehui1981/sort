package sort.quick;

import java.util.Arrays;

public class QuickSort2 {

	public static void main(String args[]) {
		int a[] = new int[] { 6, 1, 2, 7, 9, 3, 4, 5, 10, 8, 11, 0, 12, 13, -1 };
		System.out.println(Arrays.toString(a));
		sort(a, 0, a.length - 1);
		System.out.println(Arrays.toString(a));
	}

	public static void sort(int a[], int p, int r) {
		if (p < r) {
			int q = partition(a, p, r);
			sort(a, p, q - 1);
			sort(a, q + 1, r);
		}
	}

	public static int partition(int a[], int p, int r) {
		int x = a[r];
		int i = p - 1;
		for (int j = p; j <= r - 1; j++) {
			if (a[j] <= x) {
				i++;
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}

		int temp = a[r];
		a[r] = a[i + 1];
		a[i + 1] = temp;
		return i + 1;
	}

}