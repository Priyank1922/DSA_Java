package Day38_SelectionSort;

public class sortArray {

	static void sort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) { // i represent the current idx

			// find minimum element in unsorted part of array
			int min_idx = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[min_idx]) {
					min_idx = j;
				}
			}
			// swap current and minimum element ---> current index i will have correct
			// element
			// a[min_idx] , a[i];
			int temp = arr[i];
			arr[i] = arr[min_idx];
			arr[min_idx] = temp;

		}
	}

	public static void main(String[] args) {
		int[] arr = { 7, 5, 4, 1, 2 };
		sort(arr);
		for (int a : arr) {
			System.out.print(a + " ");
		}
	}

}
