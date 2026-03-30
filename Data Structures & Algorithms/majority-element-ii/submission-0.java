class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        List<Integer>list=new ArrayList<>();
        HashMap<Integer,Integer>freq=Freq(nums);
        for (int key : freq.keySet()) {
            if (freq.get(key) > n / 3) {
                list.add(key);
            }
        }
        return list;
    }

    public HashMap<Integer,Integer>Freq(int arr[]) {
        int n=arr.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++) {
            if(map.containsKey(arr[i])) {
                map.put(arr[i],map.get(arr[i])+1);
            } else {
                map.put(arr[i],1);
            }
        }
        return map;
    }
}