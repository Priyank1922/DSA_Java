package DSA;

import java.util.Scanner;

public class BinaryToDecimal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no:::");
		int binary_num = sc.nextInt();

		int ans = 0;
		int pw = 1; // 2^0 = 1
		while (binary_num > 0) {
			int unit_digit = binary_num % 10;
			ans += (unit_digit * pw);
			binary_num /= 10;
			pw *= 2;
		}
		System.out.println("Ans is :::" + ans);

	}
}
