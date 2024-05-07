package question05;

public class IrregularArray2_2 {
	public static void main(String[] args) {
		int n[][] = new int[5][];
		n[0] = new int[5];
		n[1] = new int[1];
		n[2] = new int[4];
		n[3] = new int[2];
		n[4] = new int[3];
		
//		n.length:5 (5번 반복)
		for (int i = 0; i < n.length; i++) {
//			n[i].length(5,1,4,2,3)
			for (int j = 0; j < n[i].length; j++) {
				n[i][j] = (i+3)*10+j+5;
				System.out.print(n[i][j] + " ");
			}
			System.out.println();
		}
	}
}