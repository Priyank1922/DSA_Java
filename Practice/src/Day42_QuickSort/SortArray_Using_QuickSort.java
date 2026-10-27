package Day42_QuickSort;

public class SortArray_Using_QuickSort {

	static void printArray(int[] arr) {
		for (int val : arr) {
			System.out.print(val + " ");
		}
	}

	static void swap(int[] arr, int x, int y) {
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}

	static int partition(int[] arr, int st, int end) {
		int pivot = arr[st];
		int count = 0;
		for (int i = st + 1; i <= end; i++) {
			if (arr[i] <= pivot)
				count++;
		}
		int pivotIndex = st + count;
		swap(arr, st, pivotIndex);

		int i = st, j = end;
		while (i < pivotIndex && j > pivotIndex) {
			while (arr[i] <= pivot)
				i++;
			while (arr[j] > pivot)
				j--;
			if (i < pivotIndex && j > pivotIndex) {
				swap(arr, i, j);
				i++;
				j--;
			}
		}
		return pivotIndex;
	}

	static void sort(int[] arr, int st, int end) {
		if (st >= end)
			return;

		int pi = partition(arr, st, end);
		sort(arr, st, pi - 1);
		sort(arr, pi + 1, end);
	}

	public static void main(String[] args) {
		int arr[] = { 6, 3, 1, 5, 4 };
		int n = arr.length - 1;
		System.out.println("Array before sorting...");
		printArray(arr);
		System.out.println();
		System.out.println("Array after sort...");
		sort(arr, 0, n);
		printArray(arr);
	}
}
