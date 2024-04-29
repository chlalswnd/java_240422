package qusetion01;

import java.util.Scanner;

public class ExExchange {
	public static void main(String[] args) {
//		double dollarRate = 1200;
//		double euroRate = 1500; 
		final double DOLLAR_RATE = 1200.0;
		final double EURO_RATE = 1500.0;
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("원화를 입력하세요(단위 원)>>");
		
		int won = scanner.nextInt();
		
		double dollar = won / DOLLAR_RATE;
		double euro = won / EURO_RATE;
		
		System.out.println(won + "은 $" + dollar + "입니다");
		System.out.println(won + "은 E" + euro + "입니다");
		
		scanner.close();
	}
}