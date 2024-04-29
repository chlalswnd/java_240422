package qusetion01;

import java.util.Scanner;

public class ExSumMultiply {
	public static void main(String[] args) {
		System.out.print("3자리수 정수 입력(100~999)>>");
		Scanner scan = new Scanner(System.in);
		
		int number = scan.nextInt();
		
//		100자리수 : 나누기 100의 몫
		int hun = number / 100; //100의 자리수
		int hunRest = number % 100;
//		10자리수 : 나누기 100의 나머지 10으로 나눈 몫
//		int ten = (number / 10) % 10; - 가능
		
		int ten = hunRest / 10;
		int one = hunRest % 10;
		
		int sum = hun + ten;
		int multiply = ten * one;
		
		System.out.println("100의 자리와 10의 자리의 합은 " + sum);
		System.out.println("10의 자리와 1의 자리의 곱은 " + multiply);
	}
}