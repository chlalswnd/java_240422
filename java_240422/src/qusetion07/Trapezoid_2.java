package qusetion07;

import java.util.Scanner;

public class Trapezoid_2 {
	int down;
	int up;
	int height;
	//계산 메소드
	public double getArea() {
		return 0.5 * (up + down) * height;
	}

	public static void main(String[] args) {
		Trapezoid_2 tra = new Trapezoid_2();//객체 생성 -> 생성자 호출(기본생성자 만들어서 호출<-컴파일러)
		Scanner sc = new Scanner(System.in);
		System.out.print(">>");
		tra.down = sc.nextInt();//객체로 멤버에 접근
		tra.up = sc.nextInt();//객체로 멤버에 접근
		tra.height = sc.nextInt();//객체로 멤버에 접근
		System.out.println("사다리꼴 면적은 " + tra.getArea());
		sc.close();
	}
}