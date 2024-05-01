package question03;

import java.util.Scanner;

public class CalculateGrade_2 {
	public static void main(String[] args) {
		boolean cheating;
		int attendRate, totalScore;
		char grade;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("부정해위 여부(true 혹은 false):");
		cheating = scan.nextBoolean();
		
		System.out.print("출석률(0~100)사이의 정수값:");
		attendRate = scan.nextInt();
		
		System.out.print("총점(0~100)사이의 정수값:");
		totalScore = scan.nextInt();
		
		if (cheating) {
			grade = 'F';
		} else if (attendRate < 80) {
			grade = 'F';
		} else {
			if (totalScore >= 90) {
	            grade = 'A';
	        } else if (totalScore >= 80) {
	            grade = 'B';
	        } else if (totalScore >= 70) {
	            grade = 'C';
	        } else if (totalScore >= 60) {
	            grade = 'D';
	        } else {
	            grade = 'F';
	        }
		}
		System.out.println("학점은 = " + grade);
	}
}