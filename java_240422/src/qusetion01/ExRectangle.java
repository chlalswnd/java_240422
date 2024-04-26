package qusetion01;

import java.util.Scanner;

public class ExRectangle {
	public static void main(String[] args) {
		System.out.print("가로, 세로 길이를 입력하세요>>");
		
		Scanner scan = new Scanner(System.in);

		int width = scan.nextInt();

		int length = scan.nextInt();
				
		int result = length * width;
		
		System.out.println("사각형의 면적은 " + result + "입니다.");
		scan.close();
	}
}