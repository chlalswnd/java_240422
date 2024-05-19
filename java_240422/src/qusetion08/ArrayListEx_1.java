package qusetion08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListEx_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> names = new ArrayList<>();
		for (int i = 0; i < 4; i++) {
			System.out.print("이름을 입력하세요>>");
			names.add(sc.next());
		}
		System.out.println(names);
		
		String longName = "";
		for (String string : names) {
			if (string.length() > longName.length()) {
				longName = string;
			}
		}
		System.out.println("가장 긴 이름 : " + longName);
	}
}