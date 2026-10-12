package Day31_Recursion_4;

import java.util.Scanner;

public class GCD_Using_EuclidAlgorithm {

	static int Euclid(int x, int y) {
		// base case
		if (y == 0)
			return x;
		return Euclid(y, x % y);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x ::");
		int x = sc.nextInt();
		System.out.println("Enter y::::");
		int y = sc.nextInt();
		System.out.println("ans is ::" + Euclid(x, y));
		sc.close();
	}
}
