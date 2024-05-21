package qusetion08;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RandomArray2_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 몇개?");
		int n = sc.nextInt();
		int array[] = new int[n];
		
		Set<Integer> set = new HashSet<>();
		
		for (int i = 0; i < array.length; i++) {
			int r;
			do {
				r = (int)(Math.random()*100+1);
			} while (set.contains(r));
			set.add(r);
			array[i] = r;
			if (i == 0) {
				System.out.print(array[i] + " ");
			} else {
				if (i % 10 == 0) {
					System.out.println();
				}
				
				System.out.print(array[i] + " ");
			}
		}
	}
}