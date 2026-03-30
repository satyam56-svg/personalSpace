class Solution {

    // Function to swap elements in matrix..
    public static void transpose(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix.length; j++) {
                // swapping..
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    // Function to reverse row elements..
    public void reverse(int[][] matrix) {
    int n = matrix.length;
    for (int i = 0; i < n; i++) {
        int left = 0;
        int right = n - 1;
        while (left < right) {
            int temp = matrix[i][left];
            matrix[i][left] = matrix[i][right];
            matrix[i][right] = temp;
            left++;
            right--;
        }
    }
}

    public void rotate(int[][] matrix) {

        // step1: transpose the matrix..
        transpose(matrix);

        // step2: reverse the matrix row..
        reverse(matrix);
    }
}
