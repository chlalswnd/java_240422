package question02;

import java.util.Scanner;

public class ExGlobalStock_1 {
	public static void main(String[] args) {
	
		int purchaseAmount;
		int sellingAmount;
		double transferTax = 0;
		Scanner scan = new Scanner(System.in);
	
		System.out.print("매수금액을 입력하세요: ");
		purchaseAmount = scan.nextInt();
		System.out.print("매도금액을 입력하세요: ");
		sellingAmount = scan.nextInt();
		
		if (sellingAmount > purchaseAmount) {
			transferTax = (sellingAmount - purchaseAmount) * 0.22;
		} else {
			transferTax = 0;
		}
		System.out.println("양도세 = " + transferTax);
	}
}