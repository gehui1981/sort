package sort.heap;

import java.util.Arrays;

import org.apache.commons.lang3.RandomUtils;

public class Heap {

	public static void main(String args[]) {
		int testArr[] = new int[10];
		for (int i = 0; i < 10; i++) {
			testArr[i] = i + 1; // RandomUtils.nextInt(1, 10);
		}

		Heap heap = new Heap(testArr);
		heap.sort();
		
	}

	private int arr[] = null;

	public Heap(int arr[]) {
		this.arr = arr;

		log("Before buid max heap : " + this.toString());
		buildMaxHeap();
		log("After buid max heap : " + this.toString());
	}

	public void buildMaxHeap() {
		int startIndex = parent(arr.length - 1);
		for (int i = startIndex; i >= 0; i--) {
			ajustHeap(arr.length, i);
		}
	}

	private void ajustHeap(int heapSize, int i) {

		int l = left(i);
		int r = right(i);
		int largest = i;
		if (l < heapSize && arr[l] > arr[largest]) {
			largest = l;
		}
		if (r < heapSize && arr[r] > arr[largest]) {
			largest = r;
		}

		if (largest != i) {
			int temp = arr[i];
			arr[i] = arr[largest];
			arr[largest] = temp;
			ajustHeap(heapSize, largest);
		}

	}

	private int left(int i) {
		return 2 * i + 1;
		// return (i << 1) + 1;
	}

	private int right(int i) {
		return 2 * i + 2;
		// return (i << 1) + 2;
	}

	private int parent(int i) {
		return i / 2;
		// return (i - 1) >> 1;
	}

	private void log(String s) {
		System.out.println(s);
	}

	public void sort() {
		int length = arr.length;
		for (int i = length - 1; i > 0; i--) {
			int temp = arr[i];
			arr[i] = arr[0];
			arr[0] = temp;

			ajustHeap(i, 0);
		}
		
		log("After sort : " + this.toString());
	}

	@Override
	public String toString() {
		return Arrays.toString(arr);
	}

}
