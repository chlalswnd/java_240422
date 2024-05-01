package qusetion04;

import java.util.Scanner;

public class EmergencyMoney_1 {
	public static void main(String[] args) {
		int dollar = 1200;
		int num;
		int money = 0;
		int total;
		int hunDollar = 0;
		int tenDollar;

		Scanner scan = new Scanner(System.in);
		System.out.print("가구수를 입력하시오>>");
		num = scan.nextInt();
		
		
		if (num == 1) {
			money = 400000;
		} else if (num == 2) {
			money = 600000;
		} else if (num == 3) {
			money = 800000;
		} else if (num >= 4) {
			money = 1000000;
		}
		
		total = money / dollar;
		hunDollar = total / 100;
		
		if (hunDollar > 0) {
			System.out.println("100달러짜리 " + hunDollar + "매");
		}
		tenDollar = (total % 100) / 10;
		if (tenDollar > 0) {
			System.out.println("10달러짜리 " + tenDollar + "매");
		}
	}
}