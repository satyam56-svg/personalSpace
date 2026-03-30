class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        HashSet<Integer>set1=new HashSet<>();
        HashSet<Integer>set2=new HashSet<>();
        for(int i=0; i<=n; i++) {
            set1.add(i);
        }

        for(int num:nums) {
            set2.add(num);
        }

        for(int num:set1) {
            if(!set2.contains(num)) {
                return num;
            }
        }

        return 0;
    }
}
