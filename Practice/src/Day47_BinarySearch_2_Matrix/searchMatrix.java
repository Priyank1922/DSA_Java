package Day47_BinarySearch_2_Matrix;

public class searchMatrix {
	public static boolean search(int[][] a, int target) {
		int n = a.length;
		int m = a[0].length;

		int st = 0;
		int end = n * m - 1;

		while (st <= end) {
			int mid = st + (end - st) / 2;
			int midElt = a[mid / m][mid % m];

			if (midElt == target)
				return true;

			if (target < midElt)
				end = mid - 1;
			else
				st = mid + 1;
		}
		return false;
	}

	public static void main(String args[]) {
		int[][] arr = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
		int target = 3;
		System.out.println(search(arr, target));
	}

}
