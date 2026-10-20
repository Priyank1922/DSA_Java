package Day35_Recursion_8;

public class Sum_of_SubSet {

	static void Sumsubset(int[] a, int n, int idx, int currSubsetSum) {
		// base case
		if (idx >= n) {
			System.out.println(currSubsetSum);
			return;
		}

		// curr idx + curr ans
		Sumsubset(a, n, idx + 1, currSubsetSum + a[idx]);

		// curr ans
		Sumsubset(a, n, idx + 1, currSubsetSum);
	}

	public static void main(String args[]) {
		int[] a = { 2, 4, 5 };
		Sumsubset(a, a.length, 0, 0);
	}
}
