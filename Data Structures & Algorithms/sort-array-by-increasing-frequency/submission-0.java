// import java.util.*;

class Solution {
    public int[] frequencySort(int[] nums) {

        HashMap<Integer,Integer> map = new HashMap<>();

        // frequency count
        for(int num : nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }

        // convert int[] to Integer[] for custom sorting
        Integer[] arr = new Integer[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i] = nums[i];
        }

        // custom sort
        Arrays.sort(arr, (a,b) -> {

            int freqA = map.get(a);
            int freqB = map.get(b);

            if(freqA == freqB){
                return b - a; // value descending
            }

            return freqA - freqB; // frequency increasing
        });

        // convert back
        for(int i=0;i<nums.length;i++){
            nums[i] = arr[i];
        }

        return nums;
    }
}
