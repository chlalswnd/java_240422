package question03;

import java.util.Scanner;

public class ContinueExample_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int sum = 0;
		System.out.println("정수 5개 입력하세요.");
		for (int i = 0; i < 5; i++) {
			int num = scan.nextInt();
			if (num <= 0) {
				continue;
			}
			sum += num;
		}
			System.out.println("양수의 합은 " + sum);
			scan.close();
	}
}