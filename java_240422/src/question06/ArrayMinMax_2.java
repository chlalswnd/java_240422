package question06;

import java.util.Iterator;
import java.util.Scanner;

public class ArrayMinMax_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("양수 10개를 입력하세요.");
		int num[] = new int[10];
		
		int min = 0;
		int max = 0;
		
		for (int i = 0; i < num.length; i++) {
			num[i] = scan.nextInt();
			
			if (i == 0) {
				min = num[i];
			}
			if (num[i] < min) {
				min = num[i];
			}
			if (num[i] > max) {
				max = num[i];
			}
		}
		System.out.println("가장 작은 수는 " + min + "이고,가장 큰 수는 " + max + "이고,");
		System.out.println("최소값+최대값은 " + (max + min) + "입니다.");
	}
}