package Day29_Recursion_2;

import java.util.Scanner;

public class CountOfDigit {
	static int count(int n) {
		if (n >= 0 && n <= 9)
			return 1;
		return 1 + count(n / 10);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n:::");
		int n = sc.nextInt();
		System.out.println("Count is ::" + count(n));
		sc.close();
	}
}
