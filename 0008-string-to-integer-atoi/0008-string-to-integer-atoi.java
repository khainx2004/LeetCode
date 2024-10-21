class Solution {
    public int myAtoi(String s) {
        int sign = 1;
        long num = 0L;
        int idx = 0;
        //1: Skip white space
        for (;idx < s.length() && s.charAt(idx) == ' '; idx++){

        }
        if (idx >= s.length()){
            return 0;
        }

        //2: Check sign
        // "+42", "-42", "42"
        if (s.charAt(idx) == '-' || s.charAt(idx) =='+'){
            sign = s.charAt(idx) == '-' ? -1 : 1;
            idx++;
        }

        //3: Read integer by skipping leading 0
        //"042", "42", num * 10 + digit
        for (; idx < s.length(); idx++){
            char c = s.charAt(idx);
            if (!Character.isDigit(c)){
                break;
            }
            num = num * 10 + (int)(c-'0');
            if (num > Integer.MAX_VALUE){
                break;
            }
        }

        //4: Rounding
        if (sign == -1) {
            if (num > Integer.MAX_VALUE){
                return Integer.MIN_VALUE;
            }
            return (int)(-num);
        }
        num = Math.min(num,Integer.MAX_VALUE);
        return (int)num;
    }

}