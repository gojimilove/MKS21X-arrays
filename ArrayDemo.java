public class ArrayDemo {

	public static void printArray(int[]ary) {
		System.out.print("[");
		for (int i = 0; i < ary.length; i++) {
			System.out.print(ary[i]);
			if (i < ary.length - 1) {
				System.out.print(", ");;
			}
		}
		System.out.print("]\n\n");
	}

	public static void printArray(int[][]ary) {
		for (int i = 0; i < ary.length; i++) {
			System.out.print("[");
			for (int j = 0; j < ary[i].length; j++) {
				System.out.print(ary[i][j]);
				if (j < ary[i].length - 1) {
					System.out.print(", ");
				}
			}
			System.out.print("]\n");
		}
		System.out.print("\n");
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
		int[][] filled = new int[vals.length][vals[0].length];
		for (int i = 0; i < vals.length; i++) {
			for (int j = 0; j < vals[i].length; j++) {
				if (i == j) {
					filled[i][j] = 3;
				}
				else {
					filled[i][j] = 1;
				}
			}
		}
		printArray(filled);
	}

	public static int[][] fill2DCopy(int[][]vals) {
		for (int i = 0; i < vals.length; i++) {
			for (int j = 0; j < vals[i].length; j++) {
				if (vals[i][j] < 0) {
					vals[i][j] = 3;
				}
				else {
					vals[i][j] = 1;
				}
			}
		}
		return(vals);
	}

	public static void main(String[] args) {
		int[][] tester = new int[][]{
					{1, 0, 3, 0, -5},
					{-6, 7, 0, 0, 0},
					{11, 0, -13, 14, 15}};
		
		System.out.println("Printed Array:");
		printArray(new int[]{1, 2, 3, 4, 5});
		
		System.out.println("Printed 2D Array:");
		printArray(tester);
		
		System.out.println("Number of 0s:");
		System.out.println(countZeros2D(tester) + "\n");
		
		System.out.println("Filled Array- if the row is the same as the column, the array is filled with 3s. If not, it is filled with 1s:");
		fill2D(tester);
		
		System.out.println("Filled Array- if the integer is negative, the array is filled with 3s. If not, it is filled with 1s:");
		printArray(fill2DCopy(tester));

	}

}
