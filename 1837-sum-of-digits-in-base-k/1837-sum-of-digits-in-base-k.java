class Solution {
    public int sumBase(int n, int k) {
        if (n == 10) {
            return (k / 10) + (k % 10);
        }
        else {
            int sum = 0;
            while (n > 0) {
                sum += (n % k);
                n /= k;
            }
            return sum + n;
        }
    }
}