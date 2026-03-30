class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        int[] count1 = new int[26];
        int[] count2 = new int[26];

        // count frequency of chars in s1
        for (int i = 0; i < s1.length(); i++) {
            count1[s1.charAt(i) - 'a']++;
            count2[s2.charAt(i) - 'a']++;
        }

        // compare counts for first window
        if (matches(count1, count2)) {
            return true;
        }

        // slide the window
        for (int i = s1.length(); i < s2.length(); i++) {
            // add new char to count2
            count2[s2.charAt(i) - 'a']++;
            // remove old char from count2
            count2[s2.charAt(i - s1.length()) - 'a']--;

            if (matches(count1, count2)) {
                return true;
            }
        }
        return false;
    }

    private boolean matches(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }
}
