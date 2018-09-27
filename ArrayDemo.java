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

	public static int countZeros2D(int[][]nums) {
		int result = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				if (nums[i][j] == 0) result++;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(countZeros2D(new int[][]{
													{1, 0, 3, 0, 5},
													{6, 7, 0, 0, 0},
													{11, 0, 13, 14, 15},
													}));

	}

}
