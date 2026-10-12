package Day14_Array;

class Max {

	static void Maximum() {
		int[] arr = { 2, 3, 5, 6, 7, 7, 8 };
		int ans = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > ans) {
				ans = arr[i];
			}
		}
		System.out.println("Maximum value is:::" + ans);
	}
}

public class MaximumValueInArray {
	public static void main(String[] args) {
		Max.Maximum();

	}
}
