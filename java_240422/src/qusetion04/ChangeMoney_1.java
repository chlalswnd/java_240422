package qusetion04;

import java.util.Scanner;

public class ChangeMoney_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("금액을 입력하세요: ");
        int input = scanner.nextInt();
        
        int[] money = {50000, 10000, 1000, 500, 100, 50, 10, 1};
        String[] moneyName = {"오만원권", "만원권", "천원권", "500원", 
                              "100원", "50원", "10원", 
                              "1원"};
        
        for (int i = 0; i < money.length; i++) {
            int count = input / money[i];
            input %= money[i];
        
            if (count > 0) {
            	if (money[i] > money[3]) {
                System.out.println(moneyName[i] + " " + count + "매");
            	} else {
            	System.out.println(moneyName[i] + " " + count + "개");
			}
            }
       }
        
        scanner.close();
    }
}
