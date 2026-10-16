package Day34_Recursion_in_String;

import java.util.Scanner;

public class removeAllOccurance_Without_PassingIndex {

	static String withoutIndex(String s) {
		// base case
		if (s.length() == 0)
			return "";
		// recursive work
		String smallAns = withoutIndex(s.substring(1));
		char currChar = s.charAt(0);
		if (currChar != 'a')
			return currChar + smallAns;
		else
			return smallAns;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :::");
		String s = sc.nextLine();
		System.out.println(withoutIndex(s));
		sc.close();
	}
}
