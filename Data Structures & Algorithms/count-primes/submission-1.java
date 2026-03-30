class Solution {

    public boolean prime(int n) {

        if(n <= 1) return false;
        if(n == 2) return true;
        if(n % 2 == 0) return false;   // even skip

        for(int i = 3; i * i <= n; i += 2) {   // only odd divisors
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int countPrimes(int n) {

        if(n <= 2) return 0;

        int count = 1;   // prime number 2

        for(int i = 3; i < n; i += 2) {   // only odd numbers
            if(prime(i)) count++;
        }

        return count;
    }
}