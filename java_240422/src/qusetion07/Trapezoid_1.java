package qusetion07;

import java.util.Scanner;

public class Trapezoid_1 {
	int down;
	int up;
	int height;
	
	public Trapezoid_1(int down, int up, int height) {
		this.down = down;
		this.up = up;
		this.height = height;
	}
	public double getArea() {
		return (up + down) * height / 2;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print(">>");
		
		int down = sc.nextInt();
		int up = sc.nextInt();
		int height = sc.nextInt();
		
		Trapezoid_1 a = new Trapezoid_1(down, up, height);
		System.out.println("사다리꼴 면적은 " + a.getArea());
		sc.close();
	}
}
