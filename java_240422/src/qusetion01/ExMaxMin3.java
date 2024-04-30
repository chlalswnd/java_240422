package qusetion01;

import java.util.Scanner;

public class ExMaxMin3 {
	public static void main(String[] args) {
		System.out.print("정수 3개 입력>>");
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int max = 0;
		int min = 0;
		
//		최댓값 구하기
		if (a > b && a > c) {
			max = a;
		} else if (b > a && b > c) {
			max = b;
		} else  {
			max = c;
		}
//		최소값 구하기
		if (a < b && a < c) {
			min = a;
		} else if (b < a && b < c) {
			min = b;
		} else {
			min = c;
		}
		System.out.println("최대값은 " + max);
		System.out.println("최소값은 " + min);
		scan.close();
	}
}