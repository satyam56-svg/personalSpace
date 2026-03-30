class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length() > t.length()) return false;  // ✅ Good check
        
        int i = 0, j = 0;  // Two pointers
        int m = s.length(), n = t.length();
        
        while(i < m && j < n) {
            if(s.charAt(i) == t.charAt(j)) {
                i++;  // s का character match हो गया
            }
            j++;  // t को हमेशा forward करते रहो
        }
        
        return i == m;  // s के सारे chars match हुए?
    }
}
