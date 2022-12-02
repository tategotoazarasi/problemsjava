package lintcode.lintcode2266;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int     a  = sc.nextInt();
		int     b  = sc.nextInt();
		// write your code here
		int c = a;
		a = b;
		b = c;
		// keep the code below
		System.out.println("a = " + a + ", b = " + b);
	}
}
