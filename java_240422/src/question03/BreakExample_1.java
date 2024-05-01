package question03;

import java.util.Scanner;

public class BreakExample_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("exit을 입력하면 종료합니다.");
		while (true) {
			System.out.print(">>");
			String a = scan.next();
			if (a.equals("exit")) {
				System.out.println("종료합니다...");
				break;
			}
		}
	}
}