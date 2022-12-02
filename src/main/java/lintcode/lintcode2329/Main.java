package lintcode.lintcode2329;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		short   x1;
		short   x2;
		short   y1;
		short   y2;
		Scanner in = new Scanner(System.in);
		x1 = in.nextShort();
		y1 = in.nextShort();
		x2 = in.nextShort();
		y2 = in.nextShort();
		System.out.printf("%2f", Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2)));
	}
}
