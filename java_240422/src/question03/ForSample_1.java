package question03;

public class ForSample_1 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
			System.out.print(i);
			if (i < 10) {
				System.out.print("+");
			}
		}
		System.out.println("=" + sum);
	}
}