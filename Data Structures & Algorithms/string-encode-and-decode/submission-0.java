

class Solution {

    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String s : strs) {
            sb.append(s.length()).append('#').append(s);
        }
        return sb.toString();
    }

    // Decodes a string to a list of strings.
    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int i = 0;
        while(i < str.length()) {
            // Find the position of next '#'
            int j = i;
            while(str.charAt(j) != '#') {
                j++;
            }
            // Extract length of substring
            int length = Integer.parseInt(str.substring(i, j));
            // Extract actual string of given length
            String s = str.substring(j + 1, j + 1 + length);
            res.add(s);
            // Move pointer i to next substring start
            i = j + 1 + length;
        }
        return res;
    }
}
