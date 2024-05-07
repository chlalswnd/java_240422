package qusetion04;

import java.util.Scanner;

public class ArrayMin_2 {
	public static void main(String[] args) {
//		int min = 0;
//		2.두번째 방법
		int min = Integer.MAX_VALUE;//int 타입의 가장 큰 숫자
		
		Scanner scan = new Scanner(System.in);
		System.out.println("양수 7개를 입력하세요.");
		int number[] = new int[7];
		
		for (int i = 0; i < number.length; i++) {
			number[i] = scan.nextInt();
//			1.첫번째 방법
//			첫번째 반복할때 무조건 배열원소를 min에 저장
//			if (i == 0) {
//				min = number[i];
//			}
			
			if (number[i] < min) {
				min = number[i];
			}
		}
		System.out.println("가장 작은 수는 " + min + "입니다.");
		
	}
}