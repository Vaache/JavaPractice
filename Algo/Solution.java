package Algo;

import java.util.Arrays;

class Solution {
	public boolean areSimilar(int[][] mat, int k) {
		int[][] tmpMath = mat.clone();
		for (int l = 0; l < k; ++ l) {
			for (int i = 0; i < mat.length; ++ i)
			{
				for (int j = 0; j < mat[i].length - 1; ++ j) {
					if ((i % 2) == 0)
					{
						int tmp = mat[i][j];
						mat[i][j] = mat[i][j + 1];
						mat[i][j + 1] = tmp;
					}
					else {
						int tmp = mat[i][mat[i].length - j - 1];
						mat[i][mat[i].length - j - 1] = mat[i][j];
						mat[i][j] = tmp;
					}
				}
			}
		}
		for (int i = 0; i < mat.length; ++ i) {
			for (int j = 0; j < mat.length; ++ j) {
				System.out.print(mat[i][j] + "");
			}
			System.out.println();
		}
		if (Arrays.deepEquals(tmpMath, mat))
			return true;
		return false;
	}
}