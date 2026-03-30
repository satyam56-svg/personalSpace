class Solution {
    public boolean isArmstrong(int n) {
        if (n == 0) return true;  // Optional: 0 is sometimes considered Armstrong
        
        int original = n;
        int digitCount = 0;
        
        // Count digits
        int temp = n;
        while (temp != 0) {
            digitCount++;
            temp /= 10;
        }
        
        // Compute sum of powers
        int sum = 0;
        while (n != 0) {
            int rem = n % 10;
            sum += Math.pow(rem, digitCount);
            n /= 10;
        }
        
        return sum == original;
    }
}
