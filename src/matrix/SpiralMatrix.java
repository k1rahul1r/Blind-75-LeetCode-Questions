package matrix;
import java.util.*;
//https://leetcode.com/problems/spiral-matrix/
public class SpiralMatrix {
	public List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> res = new ArrayList();
		int rowStart = 0, rowEnd = matrix.length - 1, colStart = 0, colEnd = matrix[0].length - 1;

		while (rowStart <= rowEnd && colStart <= colEnd) {
			// Traverse from left to right
			for (int j = colStart; j <= colEnd; ++j)
				res.add(matrix[rowStart][j]);
			++rowStart;

			// Traverse from top to bottom

			for (int i = rowStart; i <= rowEnd; ++i)
				res.add(matrix[i][colEnd]);
			--colEnd;

			// Traverse from right to left
			if (rowStart <= rowEnd) {
				for (int j = colEnd; j >= colStart; --j)
					res.add(matrix[rowEnd][j]);
				--rowEnd;
			}

			// Traverse from bottom to top
			if (colStart <= colEnd) {
				for (int i = rowEnd; i >= rowStart; --i)
					res.add(matrix[i][colStart]);
				++colStart;
			}
		}

		return res;
	}
}
