package question06;

import java.util.Random;

public class RandomNumber_1 {
	public static void main(String[] args) {
		int rNum;
		Random random = new Random();

        while (true) {
        	rNum = random.nextInt(10)+1;
            System.out.println(rNum);

            if (rNum == 7) {
                break;
            }
        }
    }
}