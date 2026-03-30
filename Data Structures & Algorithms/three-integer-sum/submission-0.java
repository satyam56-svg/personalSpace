class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>>result=new ArrayList<>();

        for(int i=0; i<arr.length-2; i++) {
            if(i>0 && arr[i]==arr[i-1]) continue;
            int target=(-arr[i]);
            int j=i+1,k=arr.length-1;

            while(j<k) {
                if(arr[j]+arr[k]==target) {
                    result.add(Arrays.asList(arr[i],arr[j],arr[k]));
                    j++;
                    k--;
                    while(j<k && arr[j]==arr[j-1]) j++;
                    while(j<k && arr[k]==arr[k+1]) k--;
                } else if(arr[j]+arr[k]>target) {
                    k--;
                } else {
                    j++;
                }
            }
        }

        return result;
    }
}
