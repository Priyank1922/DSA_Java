package Day37_BubbleSort;

public class BubbleSorting_Optimize_Approch {

	static void bubbleSort(int[] a) {
		int n = a.length;
		for (int i = 0; i < n - 1; i++) {
			boolean flag = false; // has any swapping happened
			for (int j = 0; j < n - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					flag = true;// some swap happen
				}
			}
			if (!flag) {
				return;
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 7, 6, 5, 4, 3 };
		bubbleSort(arr);
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
