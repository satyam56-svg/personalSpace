class Solution {
    public int minOperations(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int min = 0;

        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(var e : map.entrySet()) {
            int freq = e.getValue();

            if(freq == 1) return -1;

            min += (freq + 2) / 3;   
        }

        return min;
    }
}