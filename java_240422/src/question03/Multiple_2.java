package question03;

import java.util.Scanner;

public class Multiple_2 {
	public static void main(String[] args) {
		int number;
		boolean mutiple;
		mutiple = false;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("양의 정수를 입력하세요:");
		number = scan.nextInt();
	
		if (number % 3 == 0) {
			System.out.println("3의 배수이다.");
			mutiple = true;
		}
		if (number % 5 == 0) {
			System.out.println("5의 배수이다.");
			mutiple = true;
		}
		if (number % 8 == 0) {
			System.out.println("8의 배수이다.");
			mutiple = true;
		}
		
//		3,5,8배수의 조건이 하나도 아닐때
		if (mutiple == false) {
			System.out.println("어느 배수도 아니다.");
		}
	}
}