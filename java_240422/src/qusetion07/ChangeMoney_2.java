package qusetion07;

import java.util.Scanner;

public class ChangeMoney_2 {
	public static void main(String[] args) {
		int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
		Scanner scanner = new Scanner(System.in);
		System.out.print("금액을 입력하시오>>");
		int money = scanner.nextInt();
		
		for (int i = 0; i < unit.length; i++) {
			/*
			65123/50000 = 몫은 1 and 나머지는 15123
			15123/10000 = 몫은 1 and 나머지는 5123
			5123/1000 = 몫은 5 and 나머지는 123
			.
			.
			.
			3/1 = 몫은 3 and 나머지는 0
			*/
			int res = money / unit[i];
			if (res > 0) {
				//5만원 : 1개 -> 1만원: 1개 -> 1천원: 5개 -> 1백원: 1개 -> 1십원: 2개 -> 1원: 3개
				System.out.println(unit[i] + "원 짜리 : " + res + "개");
				money = money % unit[i];
			}
		}
	}
}