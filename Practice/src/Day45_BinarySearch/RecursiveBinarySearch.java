package Day45_BinarySearch;

public class RecursiveBinarySearch {
	static boolean search(int[] a, int target, int st, int end) {
		if (st > end)
			return false;
		int mid = (st + end) / 2;
		if (target == mid)
			return true;
		else if (target < a[mid])
			return search(a, target, st, mid - 1);
		else
			return search(a, target, mid + 1, end);
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
//		int target = 4;
		int target = 0;
		while (target != 10) {
			System.out.printf("%d exists in arrray:  %b \n", target, search(a, target, 0, a.length - 1));
			target++;
		}
		System.out.println(search(a, target, 0, a.length - 1));
	}
}
