package question02;

import java.util.Scanner;

public class WhileTest_1 {
	public static void main(String[] args) {
		int n = 0;
		int sum = 0;
		
		while (n <= 99) {
				if (n % 2 == 0) {
					sum += n;
				} n++;
			}
			System.out.println(sum);
		}
	}