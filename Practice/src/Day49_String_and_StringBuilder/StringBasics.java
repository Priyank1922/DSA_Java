package Day49_String_and_StringBuilder;

import java.util.*;

public class StringBasics {
	public static void main(String args[]) {
		String str = "DSA Practice";
		System.out.println(str);
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter name:::");
//		String s = sc.next();
//		String s = sc.nextLine();
//		System.out.println(s);

		String st = "Hello World";
		int len = st.length();
		System.out.println(len);

		String s1 = "Hello";
		System.out.println(s1.indexOf('o'));

		String stt1 = "Hello";
		String stt2 = "Hello";
		System.out.println(stt1.compareTo(stt2));

		System.out.println("--------------------------------------");

		String sttt1 = "Hello";
		String sttt2 = "Dello";
		System.out.println(sttt1.compareTo(sttt2));

		String stttt1 = "Hello";
		String stttt2 = "Zello";
		System.out.println(stttt1.compareTo(stttt2));
	}
}
