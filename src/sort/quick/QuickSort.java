package sort.quick;

import java.util.Arrays;

public class QuickSort {
	
	public static void main(String args[]) {
		int a[] = new int[] { 6, 1, 2, 7, 9, 3, 4, 5, 10, 8, 11, 0, 12, 13, -1};
		sort(a, 0, a.length - 1);
		System.out.println(Arrays.toString(a));
	}
	
	public static void sort(int arr[], int low, int high) {
		int l = low;
		int h = high;
		int povit = arr[low];

		while (l < h) {
			while (l < h && arr[h] >= povit)
				h--;
			if (l < h) {
				int temp = arr[h];
				arr[h] = arr[l];
				arr[l] = temp;
				l++;
			}

			while (l < h && arr[l] <= povit)
				l++;

			if (l < h) {
				int temp = arr[h];
				arr[h] = arr[l];
				arr[l] = temp;
				h--;
			}
		}
		System.out.println(Arrays.toString(arr));
		if (l > low)
			sort(arr, low, l - 1);
		if (h < high)
			sort(arr, l + 1, high);
	}

}