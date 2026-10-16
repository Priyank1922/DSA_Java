package Day34_Recursion_in_String;

import java.util.Scanner;

public class Remove_AllOccurances_of_Element {

	static String removeAllOccurance(String s, int idx) {
		// base case
		if (idx == s.length())
			return "";

		// recursive work
		String smallAns = removeAllOccurance(s, idx + 1);
		char currChar = s.charAt(idx);

		// self work
		if (currChar != 'a')
			return currChar + smallAns;
		else
			return smallAns;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :::");
		String s = sc.nextLine();
		System.out.println(removeAllOccurance(s, 0));
		sc.close();
	}
}
