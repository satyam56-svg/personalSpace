class Solution {
    public int maxTurbulenceSize(int[] arr) {
        int n=arr.length;
        if(n==1) return 1;

        int max=1;
        int curr=1;
        int prev=0;

        for(int i=1; i<n; i++) {
            int cmp=Integer.compare(arr[i],arr[i-1]);
            if(cmp==0) curr=1;
            else if(cmp==-prev) curr++;
            else curr=2;
            prev=cmp;
            max=Math.max(max,curr);
        }

        return max;
    }
}