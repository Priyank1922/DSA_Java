package Day27_Recursion;

import java.util.Scanner;

public class PrintNaturalNumber {

	static void printIncreasing(int n) {
		if (n == 1) {
			System.out.println(n);
			return;
		}
		printIncreasing(n - 1);
		System.out.println(n);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n:::");
		int n = sc.nextInt();
		printIncreasing(n);
		sc.close();
	}
}
