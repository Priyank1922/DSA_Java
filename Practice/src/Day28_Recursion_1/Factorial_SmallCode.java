package Day28_Recursion_1;

import java.util.Scanner;

public class Factorial_SmallCode {

	static int factorial(int n) {
		// base case
		if (n == 0)
			return 1;
		return n * factorial(n - 1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n :::");
		int n = sc.nextInt();
		System.out.println(factorial(n));

		sc.close();

	}
}
