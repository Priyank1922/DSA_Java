package Day43_Count_Bucket_RedixSort;

public class Redix_Sort {
	static void printArray(int[] arr) {
		for (int val : arr) {
			System.out.print(val + " ");
		}
	}

	static int findMax(int[] arr) {
		int mx = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > mx)
				mx = arr[i];
		}
		return mx;
	}

	static void countsort(int[] arr, int place) {
		int n = arr.length;
		int[] output = new int[n];

		// Frequency array
		int[] count = new int[10];

		for (int i = 0; i < n; i++) {
			count[(arr[i] / place) % 10]++;
		}

		// Prefix Sum Array
		for (int i = 1; i < count.length; i++) {
			count[i] += count[i - 1];
		}

		// Fill output array from right to left
		for (int i = n - 1; i >= 0; i--) {
			int idx = count[(arr[i] / place) % 10] - 1;
			output[idx] = arr[i];
			count[(arr[i] / place) % 10]--;
		}

		// Copy output back to original array
		for (int i = 0; i < n; i++) {
			arr[i] = output[i];
		}
	}

	static void radixSort(int[] arr) {
		int max = findMax(arr);
		// apply counting sort to sort elements based on placed value
		for (int place = 1; max / place > 0; place *= 10) {
			countsort(arr, place);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 43, 453, 636, 894, 8, 3 };
		System.out.println("Array before sort..");
		printArray(arr);
		radixSort(arr);
		System.out.println();
		System.out.println("Array after sort...");
		printArray(arr);
	}
}
