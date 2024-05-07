package question06;

public class TV_1 {
	String com;
	int year;
	int inch;
	
	public TV_1(String a, int b, int c) {
		com = a;
		year = b;
		inch = c;
	}
	
	void show() {
		System.out.println(com + "에서 만든 " + year + "년형 " + inch + "인치 TV");
	}
	
	public static void main(String[] args) {
		TV_1 myTv = new TV_1("LG", 2017, 32);
		
		myTv.show();
	}
}