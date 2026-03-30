class Solution {
    public int diagonalSum(int[][] mat) {

        int n = mat.length;
        int sum = 0;

        for(int i = 0; i < n; i++) {

            // primary diagonal
            sum += mat[i][i];

            // secondary diagonal
            if(i != n-1-i) {   // middle element double count avoid
                sum += mat[i][n-1-i];
            }
        }

        return sum;
    }
}
