class Solution {

    public int sum(int arr[]) {
        int s=0;
        for(int i=0; i<arr.length; i++) {
            s+=arr[i];
        }
        return s;
    }

    public int canCompleteCircuit(int[] gas, int[] cost) {
        if(sum(gas)<sum(cost)) {
            return -1;
        }
        int n=gas.length;
        int tank=0;
        int start=0;
        for(int i=0; i<n; i++) {
            tank+=gas[i]-cost[i];
            if(tank<0) {
                start=i+1;
                tank=0;
            }
        }
        return start;
    }
}
