package qusetion01;

import java.util.Scanner;

public class SeasonExIf {
	public static void main(String[] args) {
		System.out.print("달을 입력하세요(1~12)>>");
		Scanner scan = new Scanner(System.in);
		
		int month = scan.nextInt();
		
		if (3 <= month && month <= 5) {
			System.out.println("봄");
		} else if (6 <= month && month <= 8) {
			System.out.println("여름");
		} else if (9 <= month && month <= 11) {
			System.out.println("가을");
		} else if (month == 12 || month == 1 || month == 2) {
			System.out.println("겨울");
		} else {
			System.out.println("잘못 입력");
		}
		scan.close();
		}
	}
