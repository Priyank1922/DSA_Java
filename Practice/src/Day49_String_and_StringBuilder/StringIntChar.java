package Day49_String_and_StringBuilder;

import java.util.*;

public class StringIntChar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = "abc";
		str = str + "def";
		str += 'r';
		str += 10;
		System.out.println(str + 'r');
		System.out.println(str + "xyz");
		System.out.println(str + 20);
		System.out.println(str + 20 + 30);
		System.out.println(str + (20 + 30)); 
	}
}
