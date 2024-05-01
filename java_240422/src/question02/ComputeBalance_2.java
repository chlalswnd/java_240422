package question02;

import java.util.Scanner;

public class ComputeBalance_2 {
	public static void main(String[] args) {
		int balance;
		int purchaseAmount;
		Scanner scan = new Scanner(System.in);
		System.out.print("구매 금액을 입력하세요: ");
		purchaseAmount = scan.nextInt();
		
//		구매금액이 30만원 이상일때
		if (purchaseAmount >= 300000) {
//			청구금액은 3만원 할인
			balance = purchaseAmount - 30000;
//			구매금액이 10만원 이상일때
		} else if (100000 <= purchaseAmount) {
//			청구금액은 5천원 할인
			balance = purchaseAmount - 5000;
//			구매금액이 10만원 미만일때
		} else {
//			청구금액 = 구매금액
			balance = purchaseAmount;
		}
		System.out.println("구매금액 = " + purchaseAmount);
		System.out.println("청구 금액 = " + balance);
		scan.close();
	}
}