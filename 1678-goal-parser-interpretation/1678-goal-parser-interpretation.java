class Solution {
    public String interpret(String command) {
        String finalS = "";
        for (int i = 0; i < command.length(); i++) {
            if (String.valueOf(command.charAt(i)).equals("G")){
                finalS += "G";
            }
            else if (String.valueOf(command.charAt(i)).equals("(") && String.valueOf(command.charAt(i+1)).equals(")")) {
                finalS +="o";
            }
            else if (String.valueOf(command.charAt(i)).equals("(")) {
                finalS += "al";
            }

        }
        return finalS;
    }
}