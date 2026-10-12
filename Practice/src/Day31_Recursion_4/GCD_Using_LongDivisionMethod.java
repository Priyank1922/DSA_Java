package Day31_Recursion_4;

import java.util.Scanner;

public class GCD_Using_LongDivisionMethod {

	static int longDivision(int x, int y) {
		while (x % y != 0) {
			int rem = x % y;
			x = y;
			y = rem;
		}
		return y;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x:::");
		int x = sc.nextInt();
		System.out.println("Enter y:::");
		int y = sc.nextInt();
		System.out.println("Ans is ::" + " " + longDivision(x, y));
		sc.close();
	}
}
