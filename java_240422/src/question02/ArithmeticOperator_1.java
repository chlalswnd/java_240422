package question02;

import java.util.Scanner;

public class ArithmeticOperator_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요:");
		
		int n = scan.nextInt();
		
		int hour = n / 3600;
		int min = (n / 60) % 60;
		int sec = n % 60;
		
		System.out.println(n + "초는 " + hour + "시간, " + min + "분, " + sec + "초입니다.");
		scan.close();
	}
}