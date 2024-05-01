package question03;

import java.util.Scanner;

public class Tesla_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num, a, b, tesla;
		System.out.print("매수 수량을 입력하시오>>");
		num = scan.nextInt();
		tesla = num * 520;

		a = tesla / 100;
		b = (tesla / 10) % 10;
	
		if (a != 0) {
			System.out.println("100달러짜리 " + a + "매");
		}
		if (a != 0) {
			System.out.println("10달러짜리 " + b + "매");
		}
		scan.close();
	}
}
