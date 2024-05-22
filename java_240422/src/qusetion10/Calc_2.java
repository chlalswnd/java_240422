package qusetion10;

import java.util.Scanner;

class Add2 {
	private int a,b;
	
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public int calculate() {
		return a + b;
	}
}
class Sub2 {
	private int a,b;
	
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public int calculate() {
		return a - b;
	}
}
class Mul2 {
	private int a,b;
	
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public int calculate() {
		return a * b;
	}
}
class Div2 {
	private int a,b;
	
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public int calculate() {
		int res = 0;
		try {
			res = a / b;
		} catch (Exception e) {
			System.out.println("0으로 나눌 수 없습니다.");
			return 0;
		}
		return res;
	}
	
}
public class Calc_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("두 정수와 연산자를 입력하시오>>");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		char operator = sc.next().charAt(0);
		
		switch (operator) {
		case '+':
			Add2 add = new Add2();
			add.setValue(num1, num2);
			System.out.println(add.calculate());
			break;
		case '-':
			Sub2 sub = new Sub2();
			sub.setValue(num1, num2);
			System.out.println(sub.calculate());
			break;
		case '*':
			Mul2 mul = new Mul2();
			mul.setValue(num1, num2);
			System.out.println(mul.calculate());
			break;
		case '/':
			Div2 div = new Div2();
			div.setValue(num1, num2);
			System.out.println(div.calculate());
			break;

		default:
			System.out.println("잘못된 연산자입니다.");
			break;
		}
		sc.close();
	}
}
