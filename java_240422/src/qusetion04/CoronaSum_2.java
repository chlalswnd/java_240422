package qusetion04;

import java.util.Iterator;

public class CoronaSum_2 {
	public static void main(String[] args) {
		int sum = 0;
		int[][] corona = new int [12][3];
		
		for (int i = 0; i < corona.length; i++) {
			for (int j = 0; j < corona[i].length; j++) {
				corona[i][j] = (i+1)*10+(1+j);
			}
		}
		
		for (int i = 0; i < corona.length; i++) {
			for (int j = 0; j < corona[i].length; j++) {
				sum += corona[i][j];
			}
		}
		System.out.println("1년 전체 코로나환자 수는 " + sum);
	}
}