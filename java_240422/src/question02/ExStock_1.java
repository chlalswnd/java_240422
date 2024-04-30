package question02;

import java.util.Scanner;

public class ExStock_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("코스피 지수를 입력하세요(1800~2500): ");
		int kospi = scan.nextInt();
		System.out.print("환율을 입력하세요(1100~1200): ");
		int exChange = scan.nextInt();
		
		if (exChange >= 1150) {
			if (kospi >= 2200) {
				System.out.println("상승장");
			} else if (2000 <= kospi && kospi <= 2199) {
				System.out.println("횡보장");
			}
		}
		if (exChange < 1150) {
			if (kospi >= 2300) {
				System.out.println("상승장");
			} else if (2000 <= kospi && kospi <= 2299) {
				System.out.println("횡보장");
			}
		}
		if (kospi < 2000) {
			System.out.println("하락장");
		} scan.close();
	}
}