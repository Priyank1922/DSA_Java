package Day32_Recursion;

public class Print_Max_value {

	static int maxInArray(int arr[], int idx) {
		// base case
		if (idx == arr.length - 1)
			return arr[idx];

		// recursive work
		int smallAns = maxInArray(arr, idx + 1);

		// self work
		return Math.max(smallAns, arr[idx]);
	}

	public static void main(String[] args) {
		int[] arr = { 5, 6, 7, 8, 9 };
		System.out.println("Max is :::" + maxInArray(arr, 0));
	}
}
