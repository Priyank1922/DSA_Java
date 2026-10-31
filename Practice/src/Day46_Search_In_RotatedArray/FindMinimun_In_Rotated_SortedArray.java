package Day46_Search_In_RotatedArray;

public class FindMinimun_In_Rotated_SortedArray {
	static int findMin(int[] a) {
		int n = a.length;
		int st = 0;
		int end = a.length - 1;
		int ans = -1;

		while (st <= end) {
			int mid = st + (end - st) / 2;
			if (a[mid] <= a[n - 1]) {
				ans = mid;
				end = mid - 1;
			} else {
				st = mid + 1;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		int[] a = { 3, 4, 5, 6, 1, 2 };
		System.out.println(findMin(a));
	}
}
