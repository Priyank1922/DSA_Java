package Day28_Recursion_1;

import java.util.Scanner;

public class Factorial {

	static int factorial(int n) {
		// base case
		if (n == 0)
			return 1;

		// recursive work
		int smallAns = factorial(n - 1);

		// big problem or self work
		int ans = n * smallAns;

		return ans;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n :::");
		int n = sc.nextInt();
		int result = factorial(n);
		System.out.println("Factorial is :::" + result);

		sc.close();

	}
}
