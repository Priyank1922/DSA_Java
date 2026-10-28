package Day43_Count_Bucket_RedixSort;

public class Count_Sort {

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

	static void sort(int[] arr) {
		// find the largest element present in array
		int max = findMax(arr);

		int[] count = new int[max + 1];
		for (int i = 0; i < arr.length; i++) {
			count[arr[i]]++;
		}

		int k = 0;
		for (int i = 0; i < count.length; i++) {
			for (int j = 0; j < count[i]; j++) {
				arr[k++] = i;
			}
		}

	}

	public static void main(String[] args) {
		int arr[] = { 1, 4, 5, 2, 2, 5 };
		System.out.println("Array before sort..");
		printArray(arr);
		sort(arr);
		System.out.println();
		System.out.println("Array after sort...");
		printArray(arr);

	}
}
