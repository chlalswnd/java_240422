package question03;

import java.util.Iterator;

public class DoWhileTest_1 {
	public static void main(String[] args) {
		int num = 0;
		int sum = 0;
		do {
			if (num % 2 == 0) {
				sum += num;
			}
			num++;
		} while (num <= 99);
		System.out.println(sum);
	}
}