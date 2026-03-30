class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";

        String prefix = strs[0]; // pehla string le lo
        for (int i = 1; i < strs.length; i++) {
            // jab tak current string prefix se start nahi hoti, prefix ko chhota karte jao
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.equals("")) return "";
            }
        }
        return prefix;
    }
}
