package qusetion08;

import java.util.Random;
import java.util.Scanner;

public class RandomArray_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int count = 0;
		System.out.print("정수 몇개?");
		int n = sc.nextInt();
		
		int numbers[] = new int[n];
		
		for (int i = 0; i < n; i++) {
			numbers[i] = random.nextInt(100)+1;
		}
		for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
            count++;
            if (count % 10 == 0) {
                System.out.println();
            }
        }
	}
}