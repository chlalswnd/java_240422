package question02;

import java.util.Scanner;

public class ArithmeticExSwitch_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("연산>>");
		
		int op1 = scan.nextInt();
		String op = scan.next();
		int op2 = scan.nextInt();
		
		int res = 0;
		
		switch (op) {
		case "+": res = op1 + op2; break;
		case "-": res = op1 - op2; break;
		case "*": res = op1 * op2; break;
		case "/": 
			if (op2 == 0) {
				System.out.println("0으로 나눌 수 없습니다.");
				return;
			} else {
				res = op1 / op2;
			}
			break;
		default:
			System.out.println("사칙연산이 아닙니다.");
			return;
		}
		/*
		if (op.equals("+")) {
			result = num1 + num2;
		} else if (op.equals("-")) {
			result = num1 - num2;
		} else if (op.equals("*")) {
			result = num1 * num2;
		} else if (op.equals("/")) {
			if (num2 == 0) {
				System.out.println("0으로 나눌 수 없습니다.");
//				프로그램 종료
				return;
			} else {
				result = num1 / num2;
			}
			} else {
				System.out.println("사칙연산이 아닙니다.");
//				프로그램 종료
				return;
		}*/
		System.out.println(op1 + op + op2 + "의 계산 결과는 " + res);
	} 
}
