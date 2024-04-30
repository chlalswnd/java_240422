package question02;

import java.util.Scanner;

public class NestedIf_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요(0~100): ");
		int score = scan.nextInt();
		System.out.print("학년을 입력하세요(1~4): ");
		int grade = scan.nextInt();
		
		if (score >= 60 && grade < 4) {
			System.out.println("합격!");
		} else if (score >= 70 && grade == 4) {
			System.out.println("합격!");
		} else {
			System.out.println("불합격!");
		}
		scan.close();
	}
}