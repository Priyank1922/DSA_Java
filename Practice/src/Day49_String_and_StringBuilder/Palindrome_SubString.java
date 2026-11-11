package Day49_String_and_StringBuilder;

public class Palindrome_SubString {
	public static void main(String args[]) {
		String str = "abcdcba";
		StringBuilder gtr = new StringBuilder(str);
		gtr.reverse();

		String s = gtr + "";
		if (str.equals(s)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
	}
}
