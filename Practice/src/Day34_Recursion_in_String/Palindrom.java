package Day34_Recursion_in_String;

import java.util.Scanner;

public class Palindrom {

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

		System.out.println("Enter a String:");
		String s = sc.nextLine();
 
		String rev = reverseString(s, 0);

		if (rev.equals(s))
			System.out.printf("%s is Palindrome%n", s);
		else
			System.out.printf("%s is Not Palindrome%n", s);

		sc.close();
	}
}