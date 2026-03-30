class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int newArray[]=new int[nums1.length+nums2.length];

        for(int i=0; i<nums1.length; i++) {
            newArray[i]=nums1[i];
        }

        int j=0;
        for(int i=nums1.length; i<nums2.length+nums1.length; i++) {
            newArray[i]=nums2[j++];
        }

        Arrays.sort(newArray);
        int size=newArray.length;
        double median=0.0;

        if(size%2!=0) {
            median=newArray[size/2];
        } else {
            median=(newArray[(size/2)-1]+newArray[(size/2)])/2.0;
        }

        return median;
    }
}
