class Solution {
    public int fib(int n) {
        // if (n < 2){
        //     return n;
        // }
        // return fib(n-1) + fib(n-2);
        Map<Integer,Integer> map = new HashMap<>();
        if (n < 2) {
            return n;
        }
        if (map.containsKey(n)){
            return map.get(n);
        }
        int res = fib(n-1) + fib(n-2);
        map.put(res,n);
        return res;
    }
}