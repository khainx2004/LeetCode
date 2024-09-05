class Solution {
        public static String digitSum(String s, int k){
        StringBuilder finalS = new StringBuilder(s);
        while (finalS.length() > k) {
            StringBuilder newString = new StringBuilder();
            int i = 0;
            while(i < finalS.length()) {
                int sum = 0;
                int count = 0;
                while (i < finalS.length() && count < k) {
                    sum += finalS.charAt(i) - '0';
                    i++;
                    count++;
                }
                newString.append(sum);
            }
            finalS = newString;
        }
        return finalS.toString();
    }
}