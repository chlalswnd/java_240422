package qusetion04;

import java.util.Iterator;
import java.util.Scanner;

public class PrintAsterisk_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력하시오>>");
		int a = scan.nextInt();
		
		for (int i = a; i >= 1 ; i--) {
			for (int j = 1; j <= i; j++) {
			System.out.print("*");	
			}
		System.out.println();
		}
	}
}
