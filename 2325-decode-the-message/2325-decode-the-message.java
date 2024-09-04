class Solution {
    public String decodeMessage(String key, String message) {
        Map<Character,Character> al = new HashMap<>();
        char curChar ='a';
        StringBuilder finalS = new StringBuilder();
        Set<Character> usedChars = new HashSet<>();
        for (char c: key.toCharArray()){
            if (c != ' ' && !usedChars.contains(c) ){
                al.put(c,curChar);
                usedChars.add(c);
                curChar++;
            }
        }
        for (int j =0; j < message.length();j++) {
            char newChar = al.getOrDefault(message.charAt(j),' ');
            finalS.append(newChar);
        }
        return finalS.toString();
    }
}