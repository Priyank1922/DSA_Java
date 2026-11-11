package Day49_String_and_StringBuilder;

public class Reverse_EachWord {
	public static void main(String[] args) {
		String str = "I am an educator";
		String ans = " ";
		StringBuilder sb = new StringBuilder("");
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch != ' ') {
				sb.append(ch);
			} else {
				sb.reverse();
				ans += sb;
				ans += " ";
//				sb.delete(0, sb.length());
				sb = new StringBuilder("");
			}
		}
//		System.out.println(sb);
		sb.reverse();
		ans += sb;
		System.out.println(ans);
	}
}
