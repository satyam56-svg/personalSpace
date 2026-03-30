class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int output[]=new int[n];

        ArrayList<Integer>pos=new ArrayList<>();
        ArrayList<Integer>neg=new ArrayList<>();

        for(int i=0; i<n; i++) {
            if(nums[i]>0) {
                pos.add(nums[i]);
            } else {
                neg.add(nums[i]);
            }
        }

        int p=0;
        int n1=0;
        for(int i=0; i<n; i++) {
            if(i%2==0) {
                output[i]=pos.get(p++);
            } else {
                output[i]=neg.get(n1++);
            }
        }

        return output;
    }
}