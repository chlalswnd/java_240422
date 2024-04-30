package qusetion01;

import java.util.Scanner;

import javax.security.sasl.SaslClient;

public class Median1 {
	public static void main(String[] args) {
		System.out.print("정수 3개 입력>>");
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int middleNumber = 0;
		
		if ((b < a && a < c) || (c < a && a < b)) {
			middleNumber = a;
		} else if ((a < b && b < c) || (c < b && b < a)) {
			middleNumber = b;
		} else if ((a < c && c < b) || (b < c && c < a)) {
			middleNumber = c;
		} else {
			System.out.println("다시 입력하시오");
		}
		if (middleNumber != 0) {
			System.out.println("중간 값은 " + middleNumber);
		}
		scan.close();
	}
}
