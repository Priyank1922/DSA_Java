package Day32_Recursion;

public class PrintArray {

	static void printArray(int[] arr, int idx) {
		if (idx == arr.length)
			return;

		// self work
		System.out.println(arr[idx]);

		// recursive work
		printArray(arr, idx + 1);

	}

	public static void main(String[] args) {
		int arr[] = { 3, 4, 5, 6 };
		printArray(arr, 0);
	}
}
