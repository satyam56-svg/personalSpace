class Solution {
    public int lengthOfLongestSubstring(String s) {

        // initialse two pointer with value 0..
        int left=0,right=0,maxLength=0;

        // made a hashset for checking duplicates...
        HashSet<Character>set=new HashSet<>();

        while(right<s.length()) {
            char curr=s.charAt(right);  // find character at right index untill loop ends 

            if(!set.contains(curr)) {   // if set does not contain curr
                set.add(curr);  // simply add to the set
                maxLength=Math.max(maxLength,right-left+1); // find maxLength
                right++;    // increment right pointer
            } else {
                set.remove(s.charAt(left)); // otherwise remove that character from set
                left++; // increment left pointer
            }
        }

        return maxLength;
    }
}
