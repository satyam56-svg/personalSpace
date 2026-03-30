class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int num:nums) {
            if(!mp.containsKey(num)) {
                mp.put(num,1);
            } else {
                mp.put(num,mp.get(num)+1);
            }
        }

        for(HashMap.Entry<Integer,Integer>entry:mp.entrySet()) {
            if(entry.getValue()>1) {
                return entry.getKey();
            }
        }

        return -1;
    }
}
