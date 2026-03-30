class Solution {
    public boolean canJump(int[] nums) {
        int i = 0, n = nums.length - 1;
        int speed = 0, reach = 0;

        int maxReach = 0; // ab tak ka max reach

        while (i <= maxReach) { // jab tak reachable ho
            speed = nums[i];
            reach = i + speed;

            // max reach update karo
            if (reach > maxReach) {
                maxReach = reach;
            }

            // agar last index tak pahunch gaye
            if (maxReach >= n) {
                return true;
            }

            i++; // har index check karo, direct jump mat lo
        }
        return false; // kahin beech me atak gaye
    }
}
