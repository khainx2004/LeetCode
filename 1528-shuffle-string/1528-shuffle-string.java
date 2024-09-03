class Solution {
    public String restoreString(String s, int[]indices){
        char[] finalC = new char[s.length()];
        for(int i = 0; i < s.length(); i++) {
            finalC[indices[i]] = s.charAt(i);
        }
        String finalS = new String(finalC);
        return finalS;
    }
}