package Day29_Recursion_2;

public class Power_Using_Recursion_Alternate_Approch {

	static int pow(int p, int q) {
		if (q == 0)
			return 1;
		int smallPow = pow(p, q / 2);

		if (q % 2 == 0) {
			return smallPow * smallPow;
		} else {
			return p * smallPow * smallPow;
		}
	}

	public static void main(String[] args) {
		System.out.println(pow(2, 3));
	}
}
