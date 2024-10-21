class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        // M: Max length of a string
        // N: len of strs
        // O(M*N)
        for(int i = 0; i < strs[0].length(); i++){
            boolean ok = true;
            char c = strs[0].charAt(i);
            for (String s : strs){
                if (s.length() <= i || s.charAt(i) != c){
                    ok = false;
                    break;
                }
            }
            if (!ok) {
                break;
            }
            sb.append(c);
        }
        return sb.toString();
    }
}