class Solution {
    // Helper function to check if a 1D array has duplicate digits (other than '.')
    public boolean hasDuplicate(char[] arr) {
        HashSet<Character> set = new HashSet<>();
        for (char c : arr) {
            if (c == '.') continue;
            if (set.contains(c)) return true; // Duplicate found
            set.add(c);
        }
        return false;
    }

    public boolean isValidSudoku(char[][] board) {
        // Check all rows
        for (int i = 0; i < 9; i++) {
            char[] row = new char[9];
            for (int j = 0; j < 9; j++)
                row[j] = board[i][j];
            if (hasDuplicate(row)) return false;
        }

        // Check all columns
        for (int j = 0; j < 9; j++) {
            char[] col = new char[9];
            for (int i = 0; i < 9; i++)
                col[i] = board[i][j];
            if (hasDuplicate(col)) return false;
        }

        // Check all 3x3 boxes
        for (int block = 0; block < 9; block++) {
            char[] blockArr = new char[9];
            int idx = 0;
            for (int i = 0; i < 3; i++)
                for (int j = 0; j < 3; j++)
                    blockArr[idx++] = board[3*(block/3) + i][3*(block%3) + j];
            if (hasDuplicate(blockArr)) return false;
        }

        // If no duplicates found, it's a valid Sudoku board
        return true;
    }
}
