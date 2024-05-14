package qusetion07;

public class twoDArray_2 {
	public static void main(String[] args) {
		int intArray[][] = new int[4][4];
	
		//intArray.length: 4
		for (int i = 0; i < intArray.length; i++) {
			for (int j = 0; j < intArray[i].length; j++) {
				//intArray[0][0]=3, intArray[0][1]=4, intArray[0][2]=3, intArray[0][3]=7...
				//intArray[1][0]=1, intArray[1][1]=4, intArray[1][2]=5, intArray[1][3]=7...
				//...
				//intArray[3][0]=6, intArray[3][1]=5, intArray[3][2]=2, intArray[3][3]=7...
				intArray[i][j] = (int)(Math.random() * 10 + 1);
				System.out.print(intArray[i][j] + "\t");
			}
			System.out.println();
		}
	}
}