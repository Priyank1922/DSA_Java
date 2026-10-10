package Day30_Recursion_3;

import java.util.Scanner;

public class Series_Sum {

	static int sum(int n) {
		// base case
		if (n == 0) {
			return 0;
		}
		return sum(n - 1) + n;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n::");
		int n = sc.nextInt();
		System.out.println("Sum is :::" + sum(n));

		sc.close();
	}
}
