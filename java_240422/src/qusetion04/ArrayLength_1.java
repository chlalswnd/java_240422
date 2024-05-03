package qusetion04;

import java.util.Scanner;

public class ArrayLength_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("5개의 정수를 입력하세요>>");
		double average = 0;
		double sum = 0;
		int number[] = new int[5];
		
		for (int i = 0; i < number.length; i++) {
			number[i] = scan.nextInt();
		}
		for (int i = 0; i < number.length; i++) {
			sum += number[i];
		}
		
		average = sum / number.length;
		System.out.println("평균은 " + average);
	}
}