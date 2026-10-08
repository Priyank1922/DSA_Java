package Day29_Recursion_2;

import java.util.Scanner;

public class Power_Using_Recursion {

	static int pow(int p, int q) {
		// base case
		if (q == 0)
			return 1;

		// recursive work
		int smallAns = pow(p, q - 1);

		// self work
		int ans = smallAns * p;

		return ans;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter p::");
		int p = sc.nextInt();

		System.out.println("Enter q::");
		int q = sc.nextInt();
		System.out.println("Ans is ::" + pow(p, q));
	}
}
