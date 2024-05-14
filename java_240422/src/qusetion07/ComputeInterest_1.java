package qusetion07;

import java.util.Scanner;

public class ComputeInterest_1 {
	public static void main(String[] args) {
		int principal;
		double rate;
		double balance;
		int years = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원금을 입력하세요: ");
		principal = sc.nextInt();
		System.out.print("연이율을 입력하세요: ");
		rate = sc.nextDouble();
		
		balance = principal;
		System.out.println("연도수\t원리금");

		while (balance <= (principal*2)) {
			years += 1;
			balance = balance * (1.0 + rate / 100.0);
			System.out.println(years + "\t" +balance);
		}
		System.out.println("필요한 연도수 = " + years);
	}
}