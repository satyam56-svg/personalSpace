class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int ele:arr) {
            if(!map.containsKey(ele)) {
                map.put(ele,1);
            } else {
                map.put(ele,map.get(ele)+1);
            }
        }

        int luckyNo=-1;
        for(var e: map.entrySet()) {
            if(e.getValue()==e.getKey()) {
                luckyNo=Math.max(luckyNo,e.getKey());
            }
        }

        return luckyNo;
    }
}