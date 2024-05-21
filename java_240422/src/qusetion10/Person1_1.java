package qusetion10;

import java.util.Scanner;

public class Person1_1 {
	static Scanner sc = new Scanner(System.in);
	static String lastName;
	static String firstName;
	
	public Person1_1(String lastName, String firstName) {
		this.lastName = lastName;
		this.firstName = firstName;
	}
	
	public String getLastName() {
		 return lastName;
	}
	public String getFirstName(String fname) {
		return firstName;
	}
	public int getLength() {
	    return lastName.length() + firstName.length();
	}
}
