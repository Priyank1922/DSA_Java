package Day33_Recursion_6;

public class Search_and_Return_All_Index {

	static void findAllIndex(int arr[], int target, int idx) {
		// base case
		if (idx >= arr.length)
			return;
		// self work
		if (arr[idx] == target)
			System.out.println(idx);
		// recursive work
		findAllIndex(arr, target, idx + 1);
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 1, 4, 1, 6 };
		int target = 1;
		findAllIndex(arr, target, 0);
		
	}
}
