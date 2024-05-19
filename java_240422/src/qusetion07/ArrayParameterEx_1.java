package qusetion07;

public class ArrayParameterEx_1 {
	public static void printStringArray(String[] array) {
	    for (int i = 0; i < array.length; i++) {
	        System.out.println(array[i]);
	    }
	}
	
	public static void replaceBe(String[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i].replace("be", "eat");
        }
    }
	
	public static void main(String[] args) {
		String[] exArray = {"to be or not to be"};
		printStringArray(exArray);
		replaceBe(exArray);
		printStringArray(exArray);
	}
}
