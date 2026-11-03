package Day48_BinarySearch_3;

public class Distributed_Chocolates {

	static boolean isDivisionPossible(int[] a, int m, int mxChocAllowed) {
		int numOfStudent = 1;
		int choc = 0;

		for (int i = 0; i < a.length; i++) {

			if (a[i] > mxChocAllowed)
				return false;

			if (choc + a[i] <= mxChocAllowed) {
				choc += a[i];
			} else {
				numOfStudent++;
				choc = a[i];
			}
		}

		return numOfStudent <= m;
	}

	static int helper(int[] a, int m) {

		if (a.length < m)
			return -1;

		int ans = -1;
		int st = 1;
		int end = (int) 1e9;

		while (st <= end) {

			int mid = st + (end - st) / 2;

			if (isDivisionPossible(a, m, mid)) {
				ans = mid;
				end = mid - 1;
			} else {
				st = mid + 1;
			}
		}

		return ans;
	}

	public static void main(String[] args) {

		System.out.print("1st testcase:::" + " ");
		int a[] = { 5, 3, 1, 4, 2 };
		int m = 3;
		System.out.println(helper(a, m));

		System.out.print("2nd testcase:::" + " ");
		int a2[] = { 12, 34, 67, 90 };
		int m2 = 2;
		System.out.println(helper(a2, m2));
	}
}