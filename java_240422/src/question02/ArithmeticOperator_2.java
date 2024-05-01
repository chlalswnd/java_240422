package question02;

import java.util.Scanner;

public class ArithmeticOperator_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요:");
		int n = scan.nextInt();
		
//		ex> 5000/3600=1
		int hour = n / 3600; //시간
		int min = (n / 60) % 60; //분
		int sec = n % 60; //초
		
		System.out.println(n + "초는 " + hour + "시간, " + min + "분, " + sec + "초입니다.");
		scan.close();
	}
}