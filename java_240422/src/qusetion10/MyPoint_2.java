package qusetion10;

class MyPoint_2 {
	private int x,y;
	public MyPoint_2(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Point(" + x + "," + y + ")";
	}
	public static void main(String[] args) {
		MyPoint_2 p = new MyPoint_2(3, 50);
		MyPoint_2 q = new MyPoint_2(4, 50);
		System.out.println(p);
		
		if (p.equals(q)) {
			System.out.println("같은 점");
		} else {
			System.out.println("다른 점");
		}
	}
}
