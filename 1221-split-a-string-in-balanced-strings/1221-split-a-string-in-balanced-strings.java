class Solution {
    public int balancedStringSplit(String s) {
        int countR = 0;
        int countL = 0;
        int subsCount = 0;
        for (Character i: s.toCharArray()) {
            if (i == 'R') {
                countR += 1;
            }
            else {
                countL += 1;
            }
            if (countR == countL) {
                subsCount += 1;
            }
        }
        return subsCount;
    }
}