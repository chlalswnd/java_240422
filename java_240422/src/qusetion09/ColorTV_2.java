package qusetion09;

class TV2{
	private int size;
	public TV2(int size) {this.size = size;}
	public int getSize() {return size;}
}

public class ColorTV_2 extends TV2{
	private int ncolors;

	public ColorTV_2(int size, int ncolors) {
		super(size);
		this.ncolors = ncolors;
	}
	
	public void printProperty() {
		System.out.println(getSize() + "인치 " + ncolors + "컬러");
	}
	
	public static void main(String[] args) {
		ColorTV_2 myTv = new ColorTV_2(32, 1024);
		myTv.printProperty();
	}
}
