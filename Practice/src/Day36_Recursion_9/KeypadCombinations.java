package Day36_Recursion_9;

public class KeypadCombinations {

	static void combination(String dig, String[] keypad, String result) {
		if (dig.length() == 0) {
			System.out.println(result + "");
			return;
		}
		int currNum = dig.charAt(0) - '0';
		String currChoice = keypad[currNum];

		for (int i = 0; i < currChoice.length(); i++) {
			combination(dig.substring(1), keypad, result + currChoice.charAt(i));
		}
	}

	public static void main(String[] args) {
		String dig = "23";
		String[] keypad = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
//							0	1	 2		3		4		5	 6		7		8		9
		combination(dig, keypad, "");
	}
}
