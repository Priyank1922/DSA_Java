package Day49_String_and_StringBuilder;

public class StringBasic2 {
	public static void main(String[] args) {
		String str = "Amazon";
		System.out.println(str.contains("ma"));
//		System.out.println(str.startsWith("a"));
		System.out.println(str.startsWith("A"));

		System.out.println(str.endsWith("on"));

		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());

		String s1 = "abc";
		String s2 = "des";
		System.out.println(s1.concat(s2));
	}
}
