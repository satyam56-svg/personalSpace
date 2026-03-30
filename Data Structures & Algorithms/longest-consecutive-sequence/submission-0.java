class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer>set=new HashSet<>();    // create a HashSet

        // Add the elements in set from array..
        for(int num: nums) {
            set.add(num);
        }

        // for finding longest sequence..
        int maxStreak=0;

        // trasverse through the set
        for(int num: set) {
            
            // if set does not contains num-1
            if(!set.contains(num-1)) {
                int curr=num; // initialse curr=num,currStreak=1;
                int currStreak=1;

                // if set contains curr+1 run a while loop
                while(set.contains(curr+1)) {
                    currStreak++;   // increment currStreak
                    curr++; // increment curr
                }

                // find max b/w maxStreak & currStreak
                maxStreak=Math.max(maxStreak,currStreak);
            }
        }

        return maxStreak;
    }
}
