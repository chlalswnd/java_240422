package question06;

import java.util.Scanner;

public class MutipleOfThree_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num[] = new int[10];
		System.out.print("양의 정수 10개를 입력하시오>>");

		for (int i = 0; i < 10; i++) {
			num[i] = scan.nextInt();
			}
		
		System.out.println("3의 배수는 ");
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 3 == 0) {
			System.out.println(num[i]);	
			}
		}
	}
}
