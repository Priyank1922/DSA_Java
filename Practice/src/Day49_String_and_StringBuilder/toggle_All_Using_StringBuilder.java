package Day49_String_and_StringBuilder;

import java.util.Scanner;

public class toggle_All_Using_StringBuilder {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String...");
		StringBuilder str = new StringBuilder(sc.nextLine());
//		System.out.println(str);

		// toggle
		// sample (PRiyank --> prIYANk)
		for (int i = 0; i < str.length(); i++) {
			// P-->p
			// check character small , capital
			boolean flag = true; // true -> capital
			char ch = str.charAt(i);
			if (ch == ' ')
				continue;
			int ascii = (int) ch;
			if (ascii >= 97)
				flag = false;
			if (flag == true) {
				ascii += 32;
				char dh = (char) ascii;
				str.setCharAt(i, dh);
			} else {
				ascii -= 32;
				char dh = (char) ascii;
				str.setCharAt(i, dh);
			}
		}
		System.out.println(str);
	}
}
