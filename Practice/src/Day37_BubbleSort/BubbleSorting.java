package Day37_BubbleSort;

public class BubbleSorting {

	static void bubbleSort(int[] a) {
		int n = a.length;
		// n-1 iteration
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) { // last i element are already at correct sorted position , so no need
													// to check them
				if (a[j] > a[j + 1]) { // here j is current element (j>i we sort in increasing order)
					// swap = a[j] , a[j+1]
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}

			}
		}

	}

	public static void main(String[] args) {
		int[] arr = { 7, 6, 5, 4, 3 };
		bubbleSort(arr);
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
