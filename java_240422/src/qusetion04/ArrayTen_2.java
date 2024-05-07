package qusetion04;

import java.util.Scanner;

public class ArrayTen_2 {
	public static void main(String[] args) {
		int number[] = new int[10];
		int sum = 0;

		Scanner scan = new Scanner(System.in);
		System.out.print(number.length + "개의 정수를 입력하세요>>");
		
		
		for (int i = 0; i < number.length; i++) {
			number[i] = scan.nextInt();
			sum += number[i];
		}
		System.out.println("합계는 " + sum);
		scan.close();
	}
}