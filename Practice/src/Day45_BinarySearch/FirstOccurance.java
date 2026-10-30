package Day45_BinarySearch;

public class FirstOccurance {
	static int firstOccurance(int a[], int x) {
		int n = a.length;
		int st = 0;
		int end = n - 1;
		int fo = -1; // FO = FirstOccurance        
		while (st <= end) {
			int mid = st + (end - st) / 2;
			if (a[mid] == x) {
				fo = mid;
				end = mid - 1;
			} else if (x < a[mid]) {
				end = mid - 1;
			} else {
				st = mid + 1;
			}
		}
		return fo;
	}

	public static void main(String[] args) {
		int[] a = { 1, 5, 5, 5, 6, 2, 4 };
		int x = 5;
		System.out.println("x is on index : " + firstOccurance(a, x));
	}
}
