package question03;

import java.util.Scanner;

public class ThreeSixNine_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("10~99 사이의 정수를 입력하시오>>");
		int num = scan.nextInt();
		
		int first = num / 10; //10의자리
		int second = num % 10; //1의 자리
		
			if (first == 3 || first == 6 || first == 9 && second == 3 || second == 6 || second == 9) {
				System.out.println("박수 짝짝");
			} else if (first == 3 || first == 6 || first == 9 || second == 3 || second == 6 || second == 9) {
				System.out.println("박수 짝");
			} else {
				System.out.println("박수 없음");
			}
			scan.close();
		}
	}