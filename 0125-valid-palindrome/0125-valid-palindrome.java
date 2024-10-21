class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c: s.toCharArray()){
            if (isValid(c)) {
                sb.append(toLowerCase(c));
            }
        }
        return isPali(sb.toString());
    }
    //Check if char of s is valid as character
    private boolean isValid(char c){
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c<= '9');
    }
    //to LOwer Case function
    private char toLowerCase(char c) {
        if (Character.isDigit(c)){
            return c;
        }
        // c = c - 'A' + 'a';
        return Character.toLowerCase(c);
    }
    //Helper function
    private boolean isPali(String s) {
        int l = 0, r = s.length() - 1;
        while(l <= r) {
            if (s.charAt(l) != s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}