package qusetion01;

import java.util.Scanner;

public class SumMultiply {
	public static void main(String[] args) {
		System.out.print("2개의 정수 입력>>");
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		
		int b = scan.nextInt();
		
		System.out.println("두수의 합은 " + (a + b));
		System.out.println("두수의 곱은 " + (a * b));
		
		scan.close();
	}
}