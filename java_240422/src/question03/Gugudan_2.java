package question03;

import java.util.Iterator;

public class Gugudan_2 {
	public static void main(String[] args) {
//		구구단 : 이중 for 문
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
//				System.out.println("@# i===>" + i);
//				System.out.println();
//				System.out.println("@# i===>" + j);
//				System.out.println();
//				탭으로 띄워서 정렬되게 출력
				System.out.print(i + "*" + j + "=" + i * j + "\t");
			}
//			단이 끌날때 마다 엔터
			System.out.println();
		}
	}
}