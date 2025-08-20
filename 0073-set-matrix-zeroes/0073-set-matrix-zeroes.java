class Solution {
    public void setZeroes(int[][] matrix) {
        boolean zeroInFirstCol = false;
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Step 1: Use first row and column as markers
        for (int row = 0; row < rows; row++) {
            if (matrix[row][0] == 0) zeroInFirstCol = true;
            for (int col = 1; col < cols; col++) {
                if (matrix[row][col] == 0) {
                    matrix[row][0] = 0;
                    matrix[0][col] = 0;
                }
            }
        }

        // Step 2: Zero out cells based on markers
        for (int row = 1; row < rows; row++) {
            for (int col = 1; col < cols; col++) {
                if (matrix[row][0] == 0 || matrix[0][col] == 0) {
                    matrix[row][col] = 0;
                }
            }
        }

        // Step 3: Handle first row
        if (matrix[0][0] == 0) {
            for (int col = 0; col < cols; col++) {
                matrix[0][col] = 0;
            }
        }

        // Step 4: Handle first column
        if (zeroInFirstCol) {
            for (int row = 0; row < rows; row++) {
                matrix[row][0] = 0;
            }
        }
    }
}
