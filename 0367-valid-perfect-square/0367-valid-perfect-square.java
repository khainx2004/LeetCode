class Solution {
    public boolean isPerfectSquare(int num) {
        if (num < 2) return true;
        long low = 0, high = num / 2;
        while (low <= high){
            long mid = low + (high - low) /2;
            if (mid*mid == num) {
                return true;
            }
            if ( mid*mid < num) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return false;
        
    }
}