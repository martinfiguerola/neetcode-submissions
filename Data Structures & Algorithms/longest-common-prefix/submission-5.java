class Solution {
    public String longestCommonPrefix(String[] strs) {
        // strs=["bat","bag","bank"

        String prefix = strs[0]; // "bat" 
        for (int i = 0; i < prefix.length(); i++) { // i = 0 | 0 < 3| prefix[0] = "b"
            for (String s : strs) {
                if (i == s.length() || prefix.charAt(i) != s.charAt(i)){
                    return prefix.substring(0, i);
                }
            }
        }
        return prefix;
        
    }
}