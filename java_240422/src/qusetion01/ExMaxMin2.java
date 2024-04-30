package qusetion01;

import java.util.Scanner;

public class ExMaxMin2 {
	public static void main(String[] args) {
		System.out.print("정수 3개 입력>>");
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int max = 0;
		int min = 0;
		
		if (a > b && a > c) {
			max = a;
		}
		if (b > a && b > c) {
			max = b;
		}
		if (c > a && c > b) {
			max = c;
		}
		if (a < b && a < c) {
			min = a;
		}
		if (b < a && b < c) {
			min = b;
		}
		if (c < a && c < b) {
			min = c;
		}
		System.out.println("최대값은 " + max);
		System.out.println("최소값은 " + min);
	}
}
