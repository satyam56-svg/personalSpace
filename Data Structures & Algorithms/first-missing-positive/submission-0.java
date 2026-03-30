class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        
        // Store all elements in HashSet
        for (int num : nums) {
            set.add(num);
        }

        // Start checking from 1, because we want the smallest positive number
        int i = 1;
        while (true) {
            if (!set.contains(i)) {
                return i;
            }
            i++;
        }
    }
}
