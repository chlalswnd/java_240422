package question06;

import java.util.Scanner;

public class Grade_1 {
	private int math;
	private int science;
	private int english;


public Grade_1(int m, int s, int e) {
	math = m;
	science = s;
	english = e;
}

public int average() {
	return (math + science + english) / 3;
}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력>>");

		int math = scanner.nextInt();
        int science = scanner.nextInt(); 
        int english = scanner.nextInt();
        
        Grade_1 me = new Grade_1(math, science, english);
        System.out.println("평균은 " + me.average());
        scanner.close();
	}
}