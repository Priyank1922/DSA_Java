package Day32_Recursion;

public class SumOfArray {

	static int sumArray(int arr[], int idx) {
		// base case
		if (idx == arr.length)
			return 0;
		// recursive work
		int smallAns = sumArray(arr, idx + 1);
		// self work
		return smallAns + arr[idx];
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4 };
		System.out.println("Sum is:::" + sumArray(arr, 0));
	}
}
