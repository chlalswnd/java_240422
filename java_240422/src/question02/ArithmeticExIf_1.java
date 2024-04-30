package question02;

import java.util.Scanner;

public class ArithmeticExIf_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("연산>>");
		int num1 = scan.nextInt();
		String op = scan.next();
		int num2 = scan.nextInt();
		
		int result = 0;
		
		if (op.equals("+")) {
			result = num1 + num2;
		} else if (op.equals("-")) {
			result = num1 - num2;
		} else if (op.equals("*")) {
			result = num1 * num2;
		} else if (op.equals("/")) {
			if (num1 == 0 || num2 == 0) {
				System.out.println("0으로 나눌 수 없습니다.");
				return;
			}
			result = num1 / num2;
	}
		System.out.println(num1 + op + num2 + "의 계산 결과는 " + result);
		scan.close();
	} 
}
