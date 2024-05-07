package qusetion04;

public class CoronaSum_1 {
	public static void main(String[] args) {
		int sum = 0;
		int[][] corona = {{11,12,13},{21,22,23},{31,32,33},{41,42,43},{51,52,53},{61,62,63},
						  {71,72,73},{81,82,83},{91,92,93},{101,102,103},{111,112,113},{121,122,123}};
		for (int i = 0; i < corona.length; i++) {
			for (int j = 0; j < corona[i].length; j++) {
				sum += corona[i][j];
			}
		}
		System.out.println("1년 전체 코로나환자 수는 " + sum);
	}
}