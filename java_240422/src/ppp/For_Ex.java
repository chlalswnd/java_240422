package ppp;

import java.util.Scanner;

public class For_Ex {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("입력: ");
        int number = scan.nextInt();

        for (int i = 0; i < number; i++) {
            // a
            for (int j = 0; j < number - i; j++) {
                System.out.print("a");
            }
            // *
            for (int k = 0; k < (i * 2) + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        scan.close();
    }
}