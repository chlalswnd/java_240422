package qusetion01;

import java.util.Scanner;

public class ExArea {
	public static void main(String[] args) {
		System.out.print("정수를 입력하시오>>");
		Scanner scanner = new Scanner(System.in);
		
		int l1 = scanner.nextInt();
		int l2 = scanner.nextInt();
		int l3 = scanner.nextInt();
		
//		마지막 숫자가 0이면 삼각형의 넓이
		if (l3 == 0) {
			float triangle = (l1 * l2) / 2;
			System.out.println("삼각형의 넓이는 " + triangle);
		} else {
			float trapezium = ((l1 + l2) * l3) / 2;
			System.out.println("사다리꼴 넓이는 " + trapezium);
		}
		scanner.close();
	}
}
