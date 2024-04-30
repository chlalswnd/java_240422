package qusetion01;

import java.util.Scanner;

public class Median2 {
	public static void main(String[] args) {
		System.out.print("정수 3개 입력>>");
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int median = 0;
		
		if ((b < a && a < c) || (c < a && a < b)) {
			median = a;
		} else if ((a < b && b < c) || (c < b && b < a)) {
			median = b;
		} else {
			median = c;
		}
			System.out.println("중간 값은 " + median);
			scan.close();
		}
	}