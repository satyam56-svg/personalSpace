class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        if (n < 2) return s;

        boolean[][] dp = new boolean[n][n];
        int start = 0, maxLen = 1;

        // single characters are palindrome
        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
        }

        // check substrings of length >= 2
        for (int len = 2; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;

                if (s.charAt(i) == s.charAt(j)) {
                    if (len == 2) {
                        dp[i][j] = true; // two same chars
                    } else {
                        dp[i][j] = dp[i + 1][j - 1]; // shrink and check
                    }

                    if (dp[i][j] && len > maxLen) {
                        start = i;
                        maxLen = len;
                    }
                }
            }
        }

        return s.substring(start, start + maxLen);
    }
}
