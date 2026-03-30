class Solution {
    public int jump(int[] nums) {
        int n=nums.length;
        int jumps=0;    // total jumps liye
        int currentEnd=0;   // current jump se jo farthest index cover hota h
        int farthest=0; // scan karte hue ab tak ka farthest reachable index

        for(int i=0; i<n-1; i++) {
            farthest=Math.max(farthest,i+nums[i]);
            if(i==currentEnd) {
                jumps++;
                currentEnd=farthest;
                if(currentEnd>=n-1) break;
            }
        }
        return jumps;
    }
}
