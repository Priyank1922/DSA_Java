package Day24_2d_Array_sumOfRectangle;

import java.util.Scanner;

public class sumOfRectangle__PrefixSum {
	static void printArray(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	static void findPrefixSum(int[][] matrix) {
		int r = matrix.length;
		int c = matrix[0].length;

		// traverse horizontally to calculate prefix sum
		for (int i = 0; i < r; i++) {
			for (int j = 1; j < c; j++) {
				matrix[i][j] += matrix[i][j - 1];
			}
		}
	}

	static int FindSum(int[][] matrix, int l1, int r1, int l2, int r2) {
		int sum = 0;
		findPrefixSum(matrix);
		for (int i = l1; i <= l2; i++) {
			// r1 to r2 sum for row i
			if (r1 >= 1) {
				sum += matrix[i][r2] - matrix[i][r1 - 1];
			} else {
				sum += matrix[i][r2];
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

		System.out.println("Rectangle  sum is :::" + FindSum(matrix, l1, r1, l2, r2));

		sc.close();
	}

}
