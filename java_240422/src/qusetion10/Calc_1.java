package qusetion10;

import java.util.Scanner;

class Add {
	public int a;
	public int b;
	
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public int calculate() {
		return a + b;
	}
}
class Sub {
	public int a;
	public int b;
	
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public int calculate() {
		return a - b;
	}
}
class Mul {
	public int a;
	public int b;
	
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public int calculate() {
		return a * b;
	}
}
class Div {
	public int a;
	public int b;
	
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public int calculate() {
		return a / b;
	}
}
public class Calc_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("두 정수와 연산자를 입력하시오>>");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		String cal = sc.next();
		
		switch (cal) {
		case "+":
			Add add = new Add();
			add.setValue(num1, num2);
			System.out.println(add.calculate());
			break;
		case "-":
			Sub sub = new Sub();
			sub.setValue(num1, num2);
			System.out.println(sub.calculate());
			break;
		case "*":
			Mul mul = new Mul();
			mul.setValue(num1, num2);
			System.out.println(mul.calculate());
			break;
		case "/":
			Div div = new Div();
			div.setValue(num1, num2);
			System.out.println(div.calculate());
			break;
		default:
			break;
		}
	}
}