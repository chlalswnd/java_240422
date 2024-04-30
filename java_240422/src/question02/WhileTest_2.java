package question02;

import java.util.Scanner;

public class WhileTest_2 {
	public static void main(String[] args) {
		int n = 0, sum = 0;
		
		while (n < 100) {
				sum += n;
				n += 2;
			}
			System.out.println(sum);
	}
}