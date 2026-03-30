class Solution {
    public int countCharacters(String[] words, String chars) {

        int[] freq = new int[26];

        // allowed chars ka frequency
        for(char ch : chars.toCharArray()) {
            freq[ch - 'a']++;
        }

        int sum = 0;

        for(String word : words) {

            int[] temp = new int[26];
            boolean isValid = true;

            for(char ch : word.toCharArray()) {
                temp[ch - 'a']++;

                if(temp[ch - 'a'] > freq[ch - 'a']) {
                    isValid = false;
                    break;
                }
            }

            if(isValid) {
                sum += word.length(); // length add karna hai
            }
        }

        return sum;
    }
}