package question02;

import java.util.Scanner;

public class ComputeBalance_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("구매 금액을 입력하세요: ");
		int purchaseAmount = scan.nextInt();
		int balance;
		
		if (purchaseAmount >= 300000) {
			balance = purchaseAmount - 30000;
		} else if (100000 <= purchaseAmount) {
			balance = purchaseAmount - 5000;
		} else {
			balance = purchaseAmount;
		}
		System.out.println("구매금액 = " + purchaseAmount);
		System.out.println("청구 금액 = " + balance);
		scan.close();
	}
}