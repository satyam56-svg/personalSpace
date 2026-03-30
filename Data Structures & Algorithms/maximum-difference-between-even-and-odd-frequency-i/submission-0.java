class Solution {
    public int maxDifference(String s) {
        HashMap<Character, Integer> mp = new HashMap<>();

        // Count frequencies (your code - good!)
        for (char ch : s.toCharArray()) {
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);  // Cleaner than if-else
        }

        int maxOdd = 0;   // Max frequency where freq % 2 == 1
        int minEven = s.length();  // Min even freq (init high)

        for (var entry : mp.entrySet()) {  // Fixed: mp (not map)
            int freq = entry.getValue();
            if (freq % 2 == 1) {
                maxOdd = Math.max(maxOdd, freq);
            } else {
                minEven = Math.min(minEven, freq);
            }
        }

        return maxOdd - minEven;  // Guaranteed positive per constraints
    }
}
