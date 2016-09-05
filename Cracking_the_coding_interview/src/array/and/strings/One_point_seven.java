package array.and.strings;

//Write an algorithm such that if an element in an MxN matrix is 0, its entire row and
//column are set to 0.

public class One_point_seven {

	public static void main(String[] args) {

		int[][] matrix = { { 1, 2, 3 }, { 0, 9, 6, }, { 7, 8, 9 }, };

		boolean[] row = new boolean[matrix.length];
		boolean[] column = new boolean[matrix[0].length];
		int x = 0, y = 0;
		System.out.println("matrix length" + matrix.length);
		for (int i = 0; i < matrix[0].length; i++) {
			System.out.println("\n");
			for (int j = 0; j < matrix.length; j++) {
				if (matrix[i][j] == 0) {
					row[i] = true;
					column[i] = true;

				}

				System.out.println("x " + x + "and" + y);
			}

		}

		for (int i = 0; i < matrix.length; i++) {
			System.out.println("\n");
			for (int j = 0; j < matrix[0].length; j++) {
				if (row[i] || column[j]) {
					matrix[i][j] = 0;
				}
			}

		}

		for (int i = 0; i < matrix.length; i++) {
			System.out.println("\n");
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.println("" + matrix[i][j]);
			}

		}

	}

}
