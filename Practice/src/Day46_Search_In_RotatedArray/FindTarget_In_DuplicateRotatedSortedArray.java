package Day46_Search_In_RotatedArray;

public class FindTarget_In_DuplicateRotatedSortedArray {

	static int search(int[] a, int target) {
		int n = a.length;
		int st = 0;
		int end = n - 1;

		while (st <= end) {
			int mid = st + (end - st) / 2;
			if (a[mid] == target) {
				return mid;
			} else if (a[st] == a[mid] && a[mid] == a[end]) {
				st++;
				end--;
			} else if (a[mid] < a[end]) {
				if (target > a[mid] && target <= a[end]) {
					st = mid + 1;
				} else {
					end = mid - 1;
				}
			} else {
				if (target >= a[st] && target < a[mid]) {
					end = mid - 1;
				} else {
					st = mid + 1;
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] a = { 1, 1, 1, 1, 2, 2, 3, 1 };
		int target = 2;
		System.out.println(search(a, target));
	}
}
