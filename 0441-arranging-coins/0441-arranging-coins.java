class Solution {
    public int arrangeCoins(int n) {
        long low = 0, high = n, res = 0;
        while (low <= high) {
            long mid = low+(high - low)/2;
            long coins = (mid + 1) * mid/2;
            if (coins <= n) {
                res = Math.max(res,mid);
                low = mid + 1;           
            }
            else {
                high = mid -1;
            }
            
        }
        return (int) res;
    }
}