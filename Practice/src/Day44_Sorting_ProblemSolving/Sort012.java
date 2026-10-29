package Day44_Sorting_ProblemSolving;

public class Sort012 {
	static void printArray(int[] nums) {
		for (int val : nums)
			System.out.print(val + " ");
	}

	static void swap(int[] a, int x, int y) {
		int temp = a[x];
		a[x] = a[y];
		a[y] = temp;
	}

	static void sort012(int[] a) {
		int low = 0;
		int mid = 0;
		int high = a.length - 1;

		// explore the unknown region
		while (mid <= high) {
			if (a[mid] == 0) {
				swap(a, mid, low);
				mid++;
				low++;
			} else if (a[mid] == 1) {
				mid++;
			} else {
				swap(a, mid, high);
				high--;
			}
		}
	}

	public static void main(String args[]) {
		int[] nums = { 2, 2, 0, 0, 1, 1, 2, 0, 1, 0 };
		System.out.println("Array before sort....");
		printArray(nums);
		System.out.println();
		System.out.println("Array after sort...");
		sort012(nums);
		printArray(nums);
	}
}
