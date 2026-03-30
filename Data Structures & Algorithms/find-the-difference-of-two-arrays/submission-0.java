class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        
        // Build sets (unchanged)
        for(int num : nums1) set1.add(num);
        for(int num : nums2) set2.add(num);
        
        List<List<Integer>> result = new ArrayList<>();
        
        // Use sets directly - no duplicates, O(1) lookups
        List<Integer> onlyIn1 = new ArrayList<>();
        for(int num : set1) {
            if(!set2.contains(num)) {
                onlyIn1.add(num);
            }
        }
        
        List<Integer> onlyIn2 = new ArrayList<>();
        for(int num : set2) {
            if(!set1.contains(num)) {
                onlyIn2.add(num);
            }
        }
        
        result.add(onlyIn1);
        result.add(onlyIn2);
        return result;
    }
}
