class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        // step 1: Map bnana
        HashMap<String,List<String>>map=new HashMap<>();

        // step 2: har word ka character count kro
        for(String s: strs) {
            int count[]=new int[26];
            for(char c: s.toCharArray()) {
                count[c-'a']++;
            }

            // step 3: convert to string key
            StringBuilder keyBuilder = new StringBuilder();
            for(int i=0; i<26; i++) {
                keyBuilder.append(count[i]).append('#');
            }
            String key = keyBuilder.toString();

            // step 4: store in map
            if(!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);

            
        }
        // step 5: return grouped anagrams
            return new ArrayList<>(map.values());
    }
}
