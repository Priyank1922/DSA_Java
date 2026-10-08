package Day29_Recursion_2;

import java.util.Scanner;

public class SumOfDigit {

	static int Sum(int n) {
		// base case
		if (n >= 0 && n <= 9)
			return n;

		// recursive work
		int smallAns = Sum(n / 10);

		// self work
		int ans = smallAns + n % 10;
		return ans;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n:::");
		int n = sc.nextInt();
		System.out.println("Sum is ::" + Sum(n));
		sc.close();
	}
}
