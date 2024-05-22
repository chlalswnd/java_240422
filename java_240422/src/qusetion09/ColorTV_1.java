package qusetion09;

class TV{
	private int size;
	
	public TV(int size) {
		this.size = size;
	}
	
	public int getSize() {
		return size;
	}
	
}
public class ColorTV_1 extends TV{
	private int color;

	public ColorTV_1(int size, int color) {
		super(size);
		this.color = color;
	}
	
	private void printProperty() {
		System.out.println(getSize() + "인치 " + color + "컬러");
	}
	
	public static void main(String[] args) {
		ColorTV_1 myTv = new ColorTV_1(32, 1024);
		myTv.printProperty();
	}
}
