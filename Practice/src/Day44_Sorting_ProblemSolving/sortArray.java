package Day44_Sorting_ProblemSolving;

public class sortArray {

	static void printArray(int[] arr) {
		for (int val : arr)
			System.out.print(val + " ");

	}

	static void sort(int num[]) {
		int n = num.length;
		int x = -1;
		int y = -1;

		if (n <= 1)
			return; 

		// process adjacent element
		for (int i = 1; i < n; i++) {
			if (num[i - 1] > num[i]) {
				if (x == -1) { // first conflict
					x = i - 1;
					y = i;
				} else {
					y = i;
				}
			}
		}

		int temp = num[x];
		num[x] = num[y];
		num[y] = temp;
	}

	public static void main(String args[]) {
		int arr[] = { 10, 5, 6, 7, 9, 3 };
		System.out.println("Array before sort....");
		printArray(arr);
		System.out.println();
		System.out.println("Array after sort...");
		sort(arr);
		printArray(arr);
	}
}
