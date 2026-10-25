package Day40_SortingProblemSolve;

public class LexicographicalSorting {

	static void sortFruit_UsingSelectionSort(String[] s) {
		int n = s.length;

		for (int i = 0; i < n - 1; i++) {
			int min_idx = i;
			for (int j = i + 1; j < n; j++) {
				if (s[j].compareTo(s[min_idx]) < 0) {
					min_idx = j;
				}
			}
//			swap fruit[min_idx] , fruit[i];
			String temp = s[i];
			s[i] = s[min_idx];
			s[min_idx] = temp;

		}
	}

	public static void main(String args[]) {
		String[] fruits = { "papaya", "lime", "watermalon", "apple", "orange", "kiwi" };
		sortFruit_UsingSelectionSort(fruits);
		for (String val : fruits) {
			System.out.print(val + " ");
		}
	}
}
