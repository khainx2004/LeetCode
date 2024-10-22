class Solution {
    public char findKthBit(int n, int k) {
        return compute(n, k,false);
    }
    private char compute(int n, int k, boolean inverse){
        if (n==1) return inverse ? '1' : '0';
        int len = (1 << n) - 1;
        int mid = len / 2 + 1;
        if (k == mid ) return inverse ? '0' : '1';
        if (k < mid) return compute(n -1, k, inverse);
        k -= mid;
        k = mid - k;
        return compute(n-1, k, !inverse);
    }
}