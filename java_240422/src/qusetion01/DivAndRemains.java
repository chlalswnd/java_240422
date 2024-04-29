package qusetion01;

import java.util.Scanner;

public class DivAndRemains {
	public static void main(String[] args) {
		System.out.print("2자리수 정수 입력(10~99)>>");
		Scanner scan = new Scanner(System.in);
		
		int number = scan.nextInt();
		
//		10의 자리 : 나누기 10을 해서 몫
//		1의 자리 : 나누기 10을 해서 나머지
		int tenPlace = number / 10;
		int onePlace = number % 10;
		
		if (tenPlace == onePlace) {
			System.out.println("Yes! 10의 자리와 1의 자리가 같습니다");
		} else {
			System.out.println("No! 10의 자리와 1의 자리가 다릅니다");
		}
		
		scan.close();
	}
}
