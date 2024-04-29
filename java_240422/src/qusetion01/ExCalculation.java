package qusetion01;

import java.util.Scanner;

//class 여러개 사용해도 무관
class Aaa{}
class Baa{}
//public class : 자바파일 안에 두개이상 존재시 오류
//public class Caa{}
//1. JVM 이 수많은 class 에서 public class 를 찾아감
public class ExCalculation {
//	method 여러개 사용해도 무관
	public static void aaa() {}
	public static void bbb() {}
//	2. JVM이 수많은 method 에서 main 메소드를 찾아감
	public static void main(String[] args) {
		System.out.print("2개의 실수 입력>>");
		
		Scanner scanner = new Scanner(System.in);
//		nextFloat(), nextDouble() : 실수를 받는 메소드
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		
		System.out.println("두수의 덧셈은 " + (a + b));
		System.out.println("두수의 뺄셈은 " + (a - b));
		System.out.println("두수의 곱셈은 " + (a * b));
		System.out.println("두수의 나눗셈은 " + (a / b));
		
		scanner.close();
	}
}