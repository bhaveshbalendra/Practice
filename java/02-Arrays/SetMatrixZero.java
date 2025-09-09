public class SetMatrixZero {
    class Solution {
        public void setZeroes(int[][] matrix) {

            int lenRow = matrix.length;
            int lenCol = matrix[0].length;

            for (int i = 0; i < lenRow; i++) {
                for (int j = 0; j < lenCol; j++) {

                    if (matrix[i][j] == 0) {
                        checkRow(i, lenCol, matrix);
                        checkCol(j, lenRow, matrix);
                    }

                }

            }

            for (int m = 0; m < lenRow; m++) {
                for (int n = 0; n < lenCol; n++) {
                    if (matrix[m][n] == -1) {
                        matrix[m][n] = 0;
                    }
                }
            }
        }

        static void checkRow(int i, int lenCol, int[][] matrix) {
            for (int k = 0; k < lenCol; k++) {
                if (matrix[i][k] != 0) {
                    matrix[i][k] = -1;
                }
            }
        }

        static void checkCol(int j, int lenRow, int[][] matrix) {
            for (int k = 0; k < lenRow; k++) {
                if (matrix[k][j] != 0) {
                    matrix[k][j] = -1;
                }
            }
        }

    }
}
