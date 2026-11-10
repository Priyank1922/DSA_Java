package Day49_String_and_StringBuilder;

import java.util.*;

public class SubString {
	public static void main(String[] args) {
		String str = "abcde";
		System.out.println(str.substring(0, 2));
		System.out.println(str.substring(2));
		System.out.println("------------------------------------------------------");
		String s = "Prestige";
		for (int j = 2; j < 4; j++) {
			System.out.print(s.substring(j));
		}
	}
}
