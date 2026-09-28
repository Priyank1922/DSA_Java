package Day24_2d_Array_sumOfRectangle;

import java.util.Scanner;

public class sumOfRectangle_BruteForce {

	static void printArray(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	static int findSum(int[][] matrix, int l1, int r1, int l2, int r2) {

		int sum = 0;
		for (int i = l1; i <= l2; i++) {
			for (int j = r1; j <= r2; j++) {
				sum += matrix[i][j];
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of rows of matrix:::::");
		int r = sc.nextInt();

		System.out.println("Enter no of colums:::::::");
		int c = sc.nextInt();

		int matrix[][] = new int[r][c];

		int totalElements = r * c;
		System.out.println("Enter " + totalElements + " values");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}

		System.out.println("Input Matrix::::");
		printArray(matrix);

		System.out.println("Enter rectangle boundaries l1 , r1 , l2 , r2");
		int l1 = sc.nextInt();
		int r1 = sc.nextInt();
		int l2 = sc.nextInt();
		int r2 = sc.nextInt();

		System.out.println("==========================================");

		System.out.println("Rectangle  sum is :::" + findSum(matrix, l1, r1, l2, r2));

		sc.close();
	}

}
