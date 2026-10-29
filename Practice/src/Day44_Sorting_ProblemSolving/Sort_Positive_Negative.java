package Day44_Sorting_ProblemSolving;

public class Sort_Positive_Negative {
	static void printArray(int[] arr) {
		for (int val : arr)
			System.out.print(val + " ");
	}

	static void partitionMethod(int[] arr) {
		int l = 0, r = arr.length - 1;
		while (l < r) {
			while (arr[l] < 0)
				l++;
			while (arr[r] >= 0)
				r--;// using >= consider 0 on positive side
			if (l < r) {
				int temp = arr[l];
				arr[l] = arr[r];
				arr[r] = temp;
				l++;
				r--;
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { -13, 20, 7, 8, -4, -13, 11, -5, -13 };
		System.out.println("Array before sort....");
		printArray(arr);
		System.out.println();
		System.out.println("Array after sort...");
		partitionMethod(arr);
		printArray(arr);
	}
}
