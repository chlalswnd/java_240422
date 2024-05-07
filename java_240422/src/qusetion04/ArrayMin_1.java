package qusetion04;

import java.util.Scanner;

public class ArrayMin_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("양수 7개를 입력하세요.");
		
		int number[] = new int[7];
		
		for (int i = 0; i < number.length; i++) {
			int num = scan.nextInt();
			number[i] = num;
		}
		
		int minNum = number[0];
		
		for (int i = 0; i < number.length; i++) {
			if (number[i] <= minNum) {
				minNum = number[i];
			}
		}
		System.out.println("가장 작은 수는 " + minNum + "입니다.");
		scan.close();
	}
}