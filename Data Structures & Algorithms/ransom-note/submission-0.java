class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> mag = new HashMap<>();
        for (char ch : magazine.toCharArray()) {
            mag.put(ch, mag.getOrDefault(ch, 0) + 1);
        }
        for (char ch : ransomNote.toCharArray()) {
            if (!mag.containsKey(ch) || mag.get(ch) == 0) {
                return false;
            }
            mag.put(ch, mag.get(ch) - 1);
        }
        return true;
    }
}
