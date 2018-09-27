public class ArrayDemo {

	public static String printArray(int[]ary) {
		String result = "[";
		for (int i = 0; i < ary.length; i++) {
			result = result + ary[i];
			if (i < ary.length - 1) {
				result = result + ", ";
			}
		}
		result = result + "]\n";
		return result;
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

	public static void fill2D(int[][]vals) {
		for (int i = 0; i < vals.length; i++) {
			for (int j = 0; j < vals[i].length; j++) {
				if (i == j) {
					vals[i][j] = 3;
				}
				else {
					vals[i][j] = 1;
				}
			}
		}
		printArray(vals);
	}

	public static int[][] fill2DCopy(int[][]vals) {
		return(vals);
	}

	public static void main(String[] args) {
		int[][] tester = new int[][]{
					{1, 0, 3, 0, 5},
					{6, 7, 0, 0, 0},
					{11, 0, 13, 14, 15}};
		System.out.println(printArray(new int[]{1, 2, 3, 4, 5}));
		printArray(tester);
		System.out.println(countZeros2D(tester));
		fill2D(tester);

	}

}
