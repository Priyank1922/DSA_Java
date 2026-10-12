package Day14_Array;

class Test {
	void SumOfArray() {
		int[] arr = { 1, 4, 5, 6 };
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println(sum);
	}
}

public class PrintArraySum {
	public static void main(String[] args) {
		Test obj = new Test();
		obj.SumOfArray();
	}
}