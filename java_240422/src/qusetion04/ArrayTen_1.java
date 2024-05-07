package qusetion04;

import java.util.Scanner;

public class ArrayTen_1 {
	public static void main(String[] args) {
		int sum = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("10개의 정수를 입력하세요>>");
		
		int number[] = new int[10];
		
		for (int i = 0; i < number.length; i++) {
			number[i] = scan.nextInt();
			sum += number[i];
		}
		System.out.println("합계는 " + sum);
		scan.close();
	}
}
