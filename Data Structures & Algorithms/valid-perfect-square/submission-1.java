class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1) return true;
        int left=1;
        int right=num;
        while(left<right) {
            int mid=left+(right-left)/2;
            if(mid*mid==num) {
                return true;
            } else {
                right--;
            }
        }

        return false;
    }
}