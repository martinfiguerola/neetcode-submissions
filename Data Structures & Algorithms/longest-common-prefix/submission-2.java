class Solution {
    public String longestCommonPrefix(String[] strs) {

        String prefix = strs[0]; // "ba"

        for (int i = 0; i < prefix.length(); i++){
            
            for (String s : strs) {
                if( i == s.length() || s.charAt(i) != prefix.charAt(i)) {
                    return s.substring(0, i);
                }
            }
        }
        return prefix;
    }
}