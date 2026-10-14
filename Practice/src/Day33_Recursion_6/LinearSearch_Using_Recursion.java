package Day33_Recursion_6;

public class LinearSearch_Using_Recursion {

	static boolean search(int[] arr, int target, int idx) {
		// base case
		if (idx >= arr.length)
			return false;
		// self work
		if (arr[idx] == target)
			return true;
		// recursive work
//		if (search(arr, target, idx + 1))
//			return true;
//		else
//			return false;

		// recursive work
		return search(arr, target, idx + 1);
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6 };
		int target = 5;
		if (search(arr, target, 0))
			System.out.println("Yes");
		else
			System.out.println("False::");
	}
}
