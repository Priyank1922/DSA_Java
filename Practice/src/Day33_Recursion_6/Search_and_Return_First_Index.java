package Day33_Recursion_6;

public class Search_and_Return_First_Index {

	static int findIndex(int[] arr, int target, int idx) {
		// base case
		if (idx >= arr.length)
			return -1;
		// self work
		if (arr[idx] == target)
			return idx;
		// recursive work
//		if (search(arr, target, idx + 1))
//			return true;
//		else
//			return false;

		// recursive work
		return findIndex(arr, target, idx + 1);
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6 };
		int target = 5;

		System.out.println("Element is on index:::" + findIndex(arr, target, 0));
	}
}
