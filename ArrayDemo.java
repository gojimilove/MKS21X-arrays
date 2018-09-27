public class ArrayDemo {

	public static void printArray(int[]ary) {
		System.out.print("[");
		for (int i = 0; i < ary.length; i++) {
			System.out.print(ary[i] + ", ");
		}
		System.out.print("]\n");

	}

	public static void main(String[] args) {
		printArray(new int[]{1, 2, 3, 4, 5});

	}

}
