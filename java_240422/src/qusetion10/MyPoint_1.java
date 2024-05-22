package qusetion10;

class MyPoint_1 {
	private int a;
	private int b;

	public MyPoint_1(int a, int b) {
		this.a =a;
		this.b =b;
	}
	@Override
	public String toString() {
        return "Point(" + a + "," + b + ")";
    }
	
	@Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        MyPoint_1 myPoint = (MyPoint_1) obj;
        return a == myPoint.a && b == myPoint.b;
    }


	public static void main(String[] args) {
		MyPoint_1 p = new MyPoint_1(3,50);
		MyPoint_1 q = new MyPoint_1(3,50);
		System.out.println(p);
		if (p.equals(q)) {
			System.out.println("같은 점");
		} else {
			System.out.println("다른 점");
		}
	}
}
