package question06;

public class TV_2 {
 
	String com;
	int year;
	int size;
	
	public TV_2(String com, int year, int size) {
		this.com = com;
		this.year = year;
		this.size = size;
	}

	public void show() {
		System.out.print(com + "에서 만든 ");
		System.out.print(year + "년형 ");
		System.out.print(size + "인치 TV");
	}
	
	public static void main(String[] args) {
		TV_2 myTV = new TV_2("LG", 2017, 32);
		myTV.show();
	}
}