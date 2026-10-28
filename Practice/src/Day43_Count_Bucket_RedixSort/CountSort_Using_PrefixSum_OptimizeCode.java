package Day43_Count_Bucket_RedixSort;

public class CountSort_Using_PrefixSum_OptimizeCode {

	static void printArray(int[] arr) {
		for (int val : arr) {
			System.out.print(val + " ");
		}
	}

	static int findMax(int[] arr) {
		int mx = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > mx) {
				mx = arr[i];
			}
		}
		return mx;
	}

	static void sort(int[] arr) {
		int n = arr.length;
		int[] output = new int[n];

		// Find maximum element
		int max = findMax(arr);

		// Frequency array
		int[] count = new int[max + 1];

		for (int i = 0; i < n; i++) {
			count[arr[i]]++;
		}

		// Prefix Sum Array
		for (int i = 1; i < count.length; i++) {
			count[i] += count[i - 1];
		}

		// Fill output array from right to left
		for (int i = n - 1; i >= 0; i--) {
			int idx = count[arr[i]] - 1;
			output[idx] = arr[i];
			count[arr[i]]--;
		}

		// Copy output back to original array
		for (int i = 0; i < n; i++) {
			arr[i] = output[i];
		}
	}

	public static void main(String[] args) {

		int[] arr = { 1, 4, 5, 2, 2, 5 };

		System.out.println("Array before sort...");
		printArray(arr);

		sort(arr);

		System.out.println();
		System.out.println("Array after sort...");
		printArray(arr);
	}
}