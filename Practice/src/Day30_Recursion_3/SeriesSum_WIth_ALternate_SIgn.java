package Day30_Recursion_3;

import java.util.Scanner;

public class SeriesSum_WIth_ALternate_SIgn {

	static int printSum(int n) {
		if (n == 0)
			return 0;

		if (n % 2 == 0) {
			return printSum(n - 1) - n;
		} else {
			return printSum(n - 1) + n;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n::");
		int n = sc.nextInt();

		System.out.println("Ans is :::" + printSum(n));

		sc.close();
	}
}
