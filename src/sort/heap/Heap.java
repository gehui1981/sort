package sort.heap;

import java.util.Arrays;

import org.apache.commons.lang3.RandomUtils;

public class Heap {

	private int arr[] = null;

	public Heap(int arr[]) {
		this.arr = arr;
		
		log("Before buid max heap : " + Arrays.toString(arr));
		buildMaxHeap();
		log("After buid max heap : " + Arrays.toString(arr));
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
		return 2 * i;
	}

	private int right(int i) {
		return 2 * i + 1;
	}

	private int parent(int i) {
		return i / 2;
	}
	
	private void log(String s) {
		System.out.println(s);
	}
	
	public static void main(String args[]) {
		int testArr[] = new int[10];
		for (int i = 0; i < 10; i++) {
			testArr[i] = i + 1; // RandomUtils.nextInt(1, 10);
		}
		
		Heap heap = new Heap(testArr);
	}

}
