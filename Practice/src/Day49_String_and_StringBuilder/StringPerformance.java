package Day49_String_and_StringBuilder;

public class StringPerformance {
	public static void main(String[] args) {
		String str = "";
		for (int i = 1; i <= 10; i++) {
//			str = str + 1;
			str += i;
			System.out.print(str + " ");
		}
	}
}
