class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        int count = 0;

        // Substrings की length 1 से n तक check करेंगे
        for (int len = 1; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {   // साफ तरीका
                int j = i + len - 1;  // end index

                if (s.charAt(i) == s.charAt(j)) {
                    if (len <= 2) {
                        dp[i][j] = true;  // length 1 or 2 palindromes
                    } else {
                        dp[i][j] = dp[i + 1][j - 1];  // अंदर वाला check करो
                    }
                }

                if (dp[i][j]) {
                    count++;
                }
            }
        }

        return count;
    }
}
