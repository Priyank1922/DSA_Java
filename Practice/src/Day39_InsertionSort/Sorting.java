package Day39_InsertionSort;

public class Sorting {

	static void insertionSort(int[] a) {
		int n = a.length;
		for (int i = 1; i < n; i++) { // i = 1 initialy bcz we consider over 1st element is sorted
			int j = i;
			while (j > 0 && a[j] < a[j - 1]) {
				// swap a[j] , a[j-1]
				int temp = a[j];
				a[j] = a[j - 1];
				a[j - 1] = temp;
				j--;
			}
		}
	}

	public static void main(String arg[]) {
		int[] arr = { 8, 3, 6, 5, 4, 2 };
		insertionSort(arr);
		for (int val : arr) {
			System.out.print(val + " ");
		}
	}
}
