package question03;

import java.util.Scanner;

public class Tesla_2 {
	public static void main(String[] args) {
		int tesla = 520;
		int num;//수량
		int money;//tesla * num
		int res;//계산된 결과값
		
		Scanner scan = new Scanner(System.in);
		System.out.print("매수 수량을 입력하시오>>");
		num = scan.nextInt();
		money = tesla * num;
		
//		money를 가지고 100달러를 계산
		res = money / 100;
		
//		100달러짜리가 1매 이상일때
		if (res > 0) {
			System.out.println("100달러짜리 " + res + "매");
		}
		
		money = money % 100;

//		money를 가지고 10달러를 계산
		res = money / 10;
		
//		10달러짜리가 1매 이상일때
		if (res > 0) {
			System.out.println("10달러짜리 " + res + "매");
		}
	}
}