package qusetion04;

import java.util.Scanner;

public class ArrayAccess_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("양수 5개를 입력하세요.");
		int[] number = new int[5];
		
		// 입력하는거
		for (int i = 0; i < number.length; i++) {
			int num = scan.nextInt();
			number[i] = num;
		}
		
		int maxnum = number[0]; //최대값 = number[0]
		
		//최대값 정하기
		for (int i = 0; i < number.length; i++) {
			if (number[i] > maxnum) {
				maxnum = number[i];
			}
		}
		System.out.println("가장 큰 수는 " + maxnum + "입니다.");
		scan.close();
	}
}
