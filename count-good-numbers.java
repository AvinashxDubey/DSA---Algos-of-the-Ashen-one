class Solution {
    int mod = (int) 1e9 + 7;

    public int countGoodNumbers(long n) {
        long even = (n + 1) / 2, odd = n / 2;
        long a = pow(5, even) % mod;
        long b = pow(4, odd) % mod;
        return (int) ((a * b) % mod);
    }

    private long pow(long b, long exp) {
        long result = 1;
        b = b % mod;
        while (exp > 0) {
            // odd case
            if (exp % 2 == 1) {
                result = (result * b) % mod;
            }
            // even case
            b = (b * b) % mod;
            exp /= 2;
        }
        return result;
    }
}