class Solution {
    public int lastStoneWeight(int[] stones) {
        int n=stones.length;
        for(int i=0; i<n-1; i++) {
            Arrays.sort(stones);
            int diff=stones[n-1-i]-stones[n-2-i];
            stones[n-2-i]=diff;
        }
        return stones[0];
    }
}
