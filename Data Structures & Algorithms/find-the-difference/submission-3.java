class Solution {
    public char findTheDifference(String s, String t) {

        HashMap<Character, Integer> map = new HashMap<>();

        // count characters of s
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // subtract using t
        for (char ch : t.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) - 1);

            if (map.get(ch) < 0) {
                return ch;
            }
        }

        return '\0';
    }
}
