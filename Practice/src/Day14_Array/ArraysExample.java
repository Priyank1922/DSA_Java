package Day14_Array;

class ArrayTest {

	void demoArrays() {
		int[] ages = new int[3];
		float[] weights = new float[3];
		String[] names = { "Rahul", "Raj", "Abhay" };
		System.out.println(ages.length);

		ages[0] = 34;
		ages[1] = 43;
		ages[2] = 54;

//		System.out.println(ages[0]);
//		System.out.println(ages[1]);
//		System.out.println(ages[2]);

		for (int i = 0; i < 3; i++) {
			System.out.println("Using for loop::" + ages[i]);
		}

		for (int age : ages) {

			System.out.println("Using for each loop:::" + age);
		}

		int i = 0;
		while (i < 3) {
			System.out.println("Using while loop::" + ages[i]);
			++i;
		}

		System.out.println("Mannual printing..");
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);

	}

	void multiArrays() {
//		int [][] ar = new int [5][3];
		int[][] ar = { { 45, 23, 54 }, { 21, 23, 24 } };
		int[][][] arr = new int[3][4][5];

		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				System.out.println("2d loop using for loop:::" + ar[i][j]);
			}
		}

//		System.out.println(ar[0][0]);
//		System.out.println(ar[0][1]);
//		System.out.println(ar[0][2]);
//		System.out.println(ar[1][0]);
//		System.out.println(ar[1][1]);
//		System.out.println(ar[1][2]);
//		System.out.println(ar[2][0]);
//		System.out.println(ar[2][1]);
//		System.out.println(ar[2][2]);
	}
}

public class ArraysExample {

	public static void main(String[] args) {
		ArrayTest obj = new ArrayTest();
		obj.demoArrays();
		obj.multiArrays();
	}
}