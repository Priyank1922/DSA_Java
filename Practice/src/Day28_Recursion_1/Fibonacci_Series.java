package Day28_Recursion_1;

import java.util.Scanner;

public class Fibonacci_Series {

	static int fibonacci(int n) {
		// base case
//		if(n==0)return 0;
//		if(n==1)return 1;

		// base case
//		if(n==0)return n;
//		if(n==1)return n;

		// base case
		if (n == 0 || n == 1)
			return n;

		// subproblem
		int prev = fibonacci(n - 1);
		int prevPrev = fibonacci(n - 2);

		// self work
		int ans = prev + prevPrev;
		return ans;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n::::");
		int n = sc.nextInt();
		System.out.println(fibonacci(n));
	}
}
