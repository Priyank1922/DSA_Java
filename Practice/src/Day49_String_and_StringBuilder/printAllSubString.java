package Day49_String_and_StringBuilder;

public class printAllSubString {
	public static void main(String[] args) {
		String s = "abcd";
		for (int i = 0; i <= s.length() - 1; i++) {
			for (int j = i + 1; j <=  s.length(); j++) {
				System.out.print(s.substring(i, j) + " ");
			}
		}
	}
}
