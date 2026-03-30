class Solution {
    public int lengthOfLastWord(String s) {
        int len = 0;
        int n = s.length();
        int i = n - 1;

        // STEP 1: Skip trailing spaces
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        // STEP 2: Count last word
        while (i >= 0 && s.charAt(i) != ' ') {
            len++;
            i--;
        }

        return len;
    }
}