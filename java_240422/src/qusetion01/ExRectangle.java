package qusetion01;

import java.util.Scanner;

public class ExRectangle {
	public static void main(String[] args) {
		System.out.print("가로, 세로 길이를 입력하세요>>");
		
		Scanner scan = new Scanner(System.in);
//		첫번째 정수를 가로 변수로 입력 받음
		int width = scan.nextInt();
//		두번째 정수를 세로 변수로 입력 받음
		int length = scan.nextInt();
				
		int rectangleArea = length * width;
		
		System.out.println("사각형의 면적은 " + rectangleArea + "입니다.");
		scan.close();
	}
}