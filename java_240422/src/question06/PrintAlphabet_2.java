package question06;

import java.util.Scanner;

	public class PrintAlphabet_2 {
	
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    
	    System.out.print("소문자 알파벳 하나를 입력하세요>>");
	    String input = scanner.next();
	    char ch =  input.charAt(0);
	//    System.out.println(ch);
	    alphabet(ch);
	    
	    scanner.close();
	}

	public static void alphabet(char ch) {
	    for (char i = ch; i >= 'a'; i--) {
	        for (char j = 'a'; j <= i; j++) {
	            System.out.print(j);
	        }
	        System.out.println();
	    }
	}
}
