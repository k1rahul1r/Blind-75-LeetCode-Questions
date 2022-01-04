package matrix;

//https://leetcode.com/problems/set-matrix-zeroes/
public class SetMatrixZeroes {
	public void setZeroes(int[][] matrix) {
		boolean firstRow = false, firstColumn = false;
		int m = matrix.length, n = matrix[0].length;

		// first row
		for (int j = 0; j < n; ++j)
			if (matrix[0][j] == 0)
				firstRow = true;
		// first col
		for (int i = 0; i < m; ++i)
			if (matrix[i][0] == 0)
				firstColumn = true;

		for (int i = 1; i < m; ++i) {
			for (int j = 1; j < n; ++j) {
				if (matrix[i][j] == 0) {
					matrix[i][0] = 0;
					matrix[0][j] = 0;
				}
			}
		}

		for (int i = 1; i < m; ++i)
			for (int j = 1; j < n; ++j)
				if (matrix[i][0] == 0 || matrix[0][j] == 0)
					matrix[i][j] = 0;

		if (firstRow)
			for (int j = 0; j < n; ++j)
				matrix[0][j] = 0;

		if (firstColumn)
			for (int i = 0; i < m; ++i)
				matrix[i][0] = 0;

	}
}
