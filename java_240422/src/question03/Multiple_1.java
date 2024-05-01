package question03;

import java.util.Scanner;

public class Multiple_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number;
		boolean mutiple = false;
		
		System.out.print("양의 정수를 입력하세요:");
		number = scan.nextInt();
		
		if (number < 0) {
		} else {
			if (number % 3 == 0) {
				System.out.println("3의 배수이다");
				mutiple = true;
			}
			if (number % 5 == 0) {
				System.out.println("5의 배수이다");
				mutiple = true;
			}
			if (number % 8 == 0) { 
				System.out.println("8의 배수이다");
				mutiple = true;
			}
			if (!mutiple) {
				System.out.println("어느 배수도 아니다");
			} 
		}
	}
}