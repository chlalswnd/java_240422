package qusetion08;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> names = new ArrayList<>();
		for (int i = 0; i < 4; i++) {
			System.out.print("이름을 입력하세요>>");
			String s = sc.next();
			names.add(s);
		}
		
		for (int i = 0; i < names.size(); i++) {
			String name = names.get(i);
			System.out.print(name + " ");
		}
		
		int longestIndex = 0;
		for (int i = 0; i < names.size(); i++) {
			//names.get(0).length() < names.get(0).length()
			//names.get(0).length() < names.get(1).length()=> 참이면 longestIndex=i
			//names.get(0 or 1).length() < names.get(2).length()=> 참이면 longestIndex=i
			//names.get(0 or 1 or 2).length() < names.get(3).length()=> 참이면 longestIndex=i
			if (names.get(longestIndex).length() < names.get(i).length()) {
				longestIndex = i;
			}
		}
		System.out.println("\n가장 긴 이름은 : " + names.get(longestIndex));
		sc.close();
	}
}