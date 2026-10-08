package Day29_Recursion_2;

import java.util.Scanner;

public class SumOfDigit_SmallCode {
	
	static int sum(int n) {
		//base case
		if(n>0 && n<=9) return n;
		//recursive work
		
		return sum(n/10) + n % 10;
	}
	
public static void main(String [] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter n ::::");
	int n = sc.nextInt();
	System.out.println("Sum is :::"+sum(n));
	sc.close();
}
}
