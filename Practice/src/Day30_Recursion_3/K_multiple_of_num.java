package Day30_Recursion_3;

import java.util.Scanner;

public class K_multiple_of_num {
	static void printMultiple(int n, int k) {
		// base case
		if (k == 1) {
			System.out.println(n);
			return;
		}
		// recursive work
		printMultiple(n, k - 1);

		// self work
		System.out.println(n * k);
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n:::");
		int n = sc.nextInt();
		System.out.println("Enter k :::");
		int k = sc.nextInt();

		System.out.println("Multiple is ::");
		printMultiple(n, k); 
		sc.close();
	}
}
