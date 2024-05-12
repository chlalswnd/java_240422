package question06;

import java.util.Random;

public class RandomTen_1 {
	public static void main(String[] args) {
		int rNum[] = new int[10];
		Random random = new Random();
		double sum = 0;
		int count = 0;
		
		System.out.print("랜덤한 정수들 : ");
		for (int i = 0; i < rNum.length; i++) {
			rNum[i] = random.nextInt(10)+1;
			sum += rNum[i];
			count++;
			System.out.print(rNum[i] + " ");
		}
		System.out.println();	
		System.out.println("평균은 " + sum / count);
	}
}