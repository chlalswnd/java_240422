package question02;

import java.util.Scanner;

public class ArithmeticExSwitch_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("연산>>");
		
		int op1 = scan.nextInt();
		String op = scan.next();
		int op2 = scan.nextInt();
		
		int res = 0;
		
		switch (op) {
		case "+":
			res = op1 + op2;
			System.out.println(op1 + op + op2 + "의 계산 결과는 " + res);
			break;
		case "-":
			res = op1 - op2;
			System.out.println(op1 + op + op2 + "의 계산 결과는 " + res);
			break;
		case "*":
			res = op1 * op2;
			System.out.println(op1 + op + op2 + "의 계산 결과는 " + res);
			break;
		case "/":
			if (op2 == 0) {
				System.out.println("0으로 나눌 수 없습니다.");
				return;
			}
			res = op1 / op2;
			System.out.println(op1 + op + op2 + "의 계산 결과는 " + res);
			break;

		default:
			System.out.println("사칙연산이 아닙니다.");
			break;
		}
		scan.close();
	}
}
