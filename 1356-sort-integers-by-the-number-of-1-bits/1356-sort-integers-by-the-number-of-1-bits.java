import java.lang.Integer;
class Solution {
    public int[] sortByBits(int[] arr) {
        int len = arr.length;
        for(int i = 1; i < len; i++) {
            int cur = arr[i];
            int j = i - 1;
            while (j >= 0 && ((cur < arr[j] && Integer.bitCount(cur) == Integer.bitCount(arr[j])) || Integer.bitCount(cur) < Integer.bitCount(arr[j]) )) {
                arr[j+1] = arr[j];
                j -= 1;
            }
            arr[j+1] = cur;
        }
        return arr;
    }

}