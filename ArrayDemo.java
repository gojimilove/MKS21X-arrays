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
		printArray(new int[]{1, 2, 3, 4, 5});
		printArray(new int[][]{
													{1, 2, 3, 4, 5},
													{6, 7, 8, 9, 10},
													{11, 12, 13, 14, 15},
													});
		System.out.println(countZeros2D(new int[][]{
													{1, 0, 3, 0, 5},
													{6, 7, 0, 0, 0},
													{11, 0, 13, 14, 15},
													}));
		fill2D(new int[][] {
													{1, 2, 3, 4, 5},
													{6, 7, 8, 9, 10},
													{11, 12, 13, 14, 15},
													});

	}

}
