package Day35_Recursion_8;

public class Inplace_SubSequence {

	static void printSSQ(String s, String currAns) {
		// base case
		if (s.length() == 0) {
			System.out.println(currAns);
			return;
		}

		char curr = s.charAt(0);
		String remString = s.substring(1);

		// curr char --> chooses to a part of currAns
		printSSQ(remString, currAns + curr);

		// curr char --> does not choose to a part of currAns
		printSSQ(remString, currAns);
	}

	public static void main(String args[]) {
		printSSQ("abc", "");
	}
}
