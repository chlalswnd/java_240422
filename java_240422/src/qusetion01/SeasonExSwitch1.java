package qusetion01;

import java.util.Scanner;

public class SeasonExSwitch1 {
	public static void main(String[] args) {
		System.out.print("달을 입력하세요(1~12)>>");
		Scanner scan = new Scanner(System.in);
		
		int month = scan.nextInt();

		switch (month) {
		case 3, 4, 5:
			System.out.println("봄");
			break;
			
		case 6, 7, 8:
			System.out.println("여름");
		break;
		
		case 9, 10, 11:
			System.out.println("가을");
		break;
		
		case 12, 1, 2:
			System.out.println("겨울");
		break;
		
		default:
			System.out.println("잘못 입력");
			break;
		}
		scan.close();
		}
	}