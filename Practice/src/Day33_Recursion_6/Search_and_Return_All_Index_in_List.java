package Day33_Recursion_6;

import java.util.ArrayList;

public class Search_and_Return_All_Index_in_List {

	static ArrayList<Integer> allIndices(int[] arr, int target, int idx) {

		// Base Case
		if (idx >= arr.length) {
			return new ArrayList<>();
		}

		// Self Work
		ArrayList<Integer> ans = new ArrayList<>();

		if (arr[idx] == target) {
			ans.add(idx);
		}

		// Recursive Work
		ArrayList<Integer> smallAns = allIndices(arr, target, idx + 1);

		ans.addAll(smallAns);

		return ans;
	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 1, 3, 1, 4, 1 };
		int target = 1;

		ArrayList<Integer> ans = allIndices(arr, target, 0);

		for (Integer i : ans) {
			System.out.println(i);
		}
	}
}