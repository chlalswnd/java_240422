package qusetion10;

import java.util.Scanner;

public class PersonDriver1_1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("성을 입력하세요: ");
        String lname = sc.nextLine();
        System.out.print("이름을 입력하세요: ");
        String fname = sc.nextLine();
        Person1_1 person1 = new Person1_1(lname, fname);
        
        System.out.println("성: " + lname + " 이름: " + fname + " 성명의 길이: " + person1.getLength());
        
        System.out.print("성을 입력하세요: ");
        lname = sc.nextLine();
        System.out.print("이름을 입력하세요: ");
        fname = sc.nextLine();
        Person1_1 person2 = new Person1_1(lname, fname);
        
        System.out.println("성: " + lname + " 이름: " + fname + " 성명의 길이: " + person2.getLength());
	}
}