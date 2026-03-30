class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            // agar 9 se chhota hai toh 1 add karke return kar do
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            // agar 9 hai toh 0 bana do and carry aage le jao
            digits[i] = 0;
        }

        // agar poora number 999... tha toh ab sab 0 honge, naya array banake 1 daalna padega
        int[] res = new int[n + 1];
        res[0] = 1;
        return res;
    }
}
