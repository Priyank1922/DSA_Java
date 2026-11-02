package Day47_BinarySearch_2_Matrix;

public class PeakElement {
	public static int findPeakElement(int[] a) {
		int n = a.length;
		int st = 0;
		int end = n - 1;

		while (st <= end) {
			int mid = st + (end - st) / 2;

			if ((mid == 0 || a[mid] > a[mid - 1]) && (mid == n - 1 || a[mid] > a[mid + 1]))
				return mid;

			if (a[mid] < a[mid + 1])
				st = mid + 1;
			else
				end = mid - 1;
		}
		return -1;
	}

	public static void main(String[] args) {
		int nums[] = { 1, 2, 1, 3, 5, 6, 4 };
		System.out.println(findPeakElement(nums));
	}
}
