package qusetion04;

import java.util.Iterator;
import java.util.Scanner;

public class ArrayLength_2 {
	public static void main(String[] args) {
		int number[] = new int[5];
		int sum = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print(number.length + "개의 정수를 입력하세요>>");
		
		for (int i = 0; i < number.length; i++) {
//		5번 반복해서 배열원소에 정수를 저장
			number[i] = scan.nextInt();
			sum += number[i];
		}
		
		System.out.println("평균은 " + (double)sum / number.length);
		scan.close();
	}
}