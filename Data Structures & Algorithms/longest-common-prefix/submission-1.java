class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        if (strs == null || strs.length == 0) return "";

        // [ "ab", "a" "abc" ]

        String prefix = strs[0]; // "ab"

        for (int i = 0; i < prefix.length(); i++) { // "ab" 
            
            for (int j = 1; j < strs.length; j++) { // "a"
                if ( i == strs[j].length() || strs[j].charAt(i) != prefix.charAt(i)) {
                    return prefix.substring(0, i); // "a"
                }
            }
        }

        return prefix;

    }
}