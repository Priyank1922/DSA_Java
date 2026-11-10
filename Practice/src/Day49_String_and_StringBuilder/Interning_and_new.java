package Day49_String_and_StringBuilder;

public class Interning_and_new {
	public static void main(String[] args) {
		// interning : both str and gtr point single hello , gtr can't craete new memory
		String str = "Hello";
		String gtr = "Hello";

		// new -> new address and memory
		String btr = new String("Hello");

		String s = "Hello";
		String x = "Hello";
		x = "Mello";
		System.out.println(x);

		String a = "Hello";
		a = s.substring(0, 2) + 'y' + s.substring(3);
		System.out.println(a);

	}
}
