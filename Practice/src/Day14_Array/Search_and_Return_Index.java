package Day14_Array;

class IndexReturn {
	static void Search() {
		int[] arr = { 10, 5, 3, 6, 2, 3, 4 };
		int ans = -1;
//		int x = 200;
		int x = 3;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x) {
				ans = i;
				break;
			}
		}
		if (ans == -1) {
			System.out.println("Not found.....");
		} else {

			System.out.println("ans is index:::" + ans);
		}
	}
}

public class Search_and_Return_Index {
	public static void main(String[] args) {
		IndexReturn.Search();

	}
}
