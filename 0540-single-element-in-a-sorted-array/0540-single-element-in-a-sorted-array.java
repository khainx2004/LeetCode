class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int low = 0, high = n -1;
        while (low <= high) {
            int mid = low + (high - low)/2;
            
            boolean equalLeft = mid > 0 && nums[mid-1] == nums[mid];
            boolean equalRight = mid < n-1 && nums[mid+1] == nums[mid];
            if (!equalLeft && !equalRight) {
                return nums[mid];
            }
            int firstIdx = equalLeft ? mid-1 : mid;
            if (firstIdx % 2 == 0){
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return -1;
    }
}