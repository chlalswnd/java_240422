package qusetion01;

import java.util.Scanner;

public class ExMaxMin1 {
	public static void main(String[] args) {
		System.out.print("정수 3개 입력>>");
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int max = 0;
		int min = 0;
		
		if ((b < a && a > c) && (b < c)) {
			max = a;
			min = b;
		} else if ((b < a && a > c) && (b > c)) {
			max = a;
			min = c;
		} else if ((a < b && b > c) && (a > c)) {
			max = b;
			min = c;
		} else if ((a < b && b > c) && (a < c)) {
			max = b;
			min = a;
		} else if ((a < c && c > b) && (a < b)) {
			max = c;
			min = a;
		} else if ((a < c && c > b) && (a > b)) {
			max = c;
			min = b;
		} 
		System.out.println("최대값은 " + max);
		System.out.println("최소값은 " + min);
	}
}
