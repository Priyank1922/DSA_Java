package Day29_Recursion_2;

import java.util.Scanner;

public class Power_Using_Recursion_SmallCode {

	static int pow(int p, int q) {
		if (q == 0)
			return 1;
		return pow(p, q - 1) * p;
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
