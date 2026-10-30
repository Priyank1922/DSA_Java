package Day45_BinarySearch;

public class BinarySearch {
	static boolean search(int[] a, int target) {
		int n = a.length;
		int st = 0;
		int end = n - 1;
		while (st <= end) {
			int mid = (st + end) / 2;
			if (target == a[mid])
				return true;
			else if (target < a[mid])
				end = mid - 1;
			else
				st = mid + 1;
		}
		return false;
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
//		int target = 4;
		int target = 0;
		while (target != 10) {
			System.out.printf("%d exists in arrray:  %b \n", target, search(a, target));
			target++;
		}
		System.out.println(search(a, target));
	}
}
