class Solution {
    public int maxNumberOfBalloons(String text) {
        
        // calculate freq of each char
        HashMap<Character, Integer> map1 = new HashMap<>();
        for (char ch : text.toCharArray()) {
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        }

        String word = "balloon";

        HashMap<Character, Integer> map2 = new HashMap<>();
        map2.put('b', 1);
        map2.put('a', 1);
        map2.put('l', 2);
        map2.put('o', 2);
        map2.put('n', 1);

        int inst = Integer.MAX_VALUE;

        for (char ch : word.toCharArray()) {
            int freq = map1.getOrDefault(ch, 0);

            if (freq < map2.get(ch)) {
                return 0;
            } else {
                int currInst = freq / map2.get(ch);
                inst = Math.min(inst, currInst);
            }
        }

        return inst;
    }
}