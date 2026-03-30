class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int ele: nums) {
            if(!mp.containsKey(ele)) {
                mp.put(ele,1);
            } else {
                mp.put(ele,mp.get(ele)+1);
            }
        }
        for(Integer i: mp.values()) {
            if(i!=1) return true;
        }
        return false;
    }
}