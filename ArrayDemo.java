public class ArrayDemo {

	public static void printArray(int[]ary) {
		System.out.print("[");
		for (int i = 0; i < ary.length; i++) {
			System.out.print(ary[i] + ", ");
		}
		System.out.print("]\n");

	}

	public static void printArray(int[][]ary) {
		
		for (int i = 0; i < ary.length; i++) {
			System.out.print("[");
			for (int j = 0; j < ary[i].length; j++) {
				System.out.print(ary[i][j] + ", ");
			}
			System.out.print("]\n");
		}
	}

	public static void main(String[] args) {
		printArray(new int[][]{
													{1, 2, 3, 4, 5},
													{6, 7, 8, 9, 10},
													{11, 12, 13, 14, 15},
													});

	}

}
