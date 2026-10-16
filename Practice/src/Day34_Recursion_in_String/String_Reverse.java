package Day34_Recursion_in_String;

import java.util.Scanner;

public class String_Reverse {

	static String reverseString(String s, int idx) {
		// base case
		if (idx == s.length())
			return "";
		// recursive work
		String smallAns = reverseString(s, idx + 1);
		// self work
		return smallAns + s.charAt(idx);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String::");
		String s = sc.nextLine();
		System.out.println("Reverse is :::" + reverseString(s, 0));
		sc.close();
	}
}
