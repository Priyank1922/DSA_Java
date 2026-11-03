package Day48_BinarySearch_3;

import java.util.Arrays;

public class RaceTrack {

	static boolean isPossible(int[] a, int k, int dist) {
		int kidsPlaced = 1;
		int lastKid = a[0];

		for (int i = 1; i < a.length; i++) {
			if (a[i] - lastKid >= dist) {
				kidsPlaced++;
				lastKid = a[i];
			}
		}

		return kidsPlaced >= k;
	}

	static int track(int[] a, int k) {

		if (k > a.length)
			return -1;

		Arrays.sort(a);

		int st = 0;
		int end = a[a.length - 1] - a[0];
		int ans = -1;

		while (st <= end) {
			int mid = st + (end - st) / 2;

			if (isPossible(a, k, mid)) {
				ans = mid;
				st = mid + 1; // maximize distance
			} else {
				end = mid - 1;
			}
		}

		return ans;
	}

	public static void main(String[] args) {
		int[] a = { 1, 3, 4, 8, 9 };
		int k = 3;

		System.out.println(track(a, k));
	}
}