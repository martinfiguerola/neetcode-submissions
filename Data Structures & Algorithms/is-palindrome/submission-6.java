class Solution {
    public boolean isPalindrome(String s) {

        int left = 0, rigth = s.length() - 1;
        
        while(left < rigth) {

            while(left < rigth && !isAlfanumeric(s.charAt(left))) {
                left++;
            }

            while(rigth > left && !isAlfanumeric(s.charAt(rigth))) {
                rigth--;
            }

            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(rigth)) ) return false;

            left++;
            rigth--;

        }

        return true;
    }

    public boolean isAlfanumeric(char c) {
        return (
            c >= 'A' && c <= 'Z' 
            || c >= 'a' && c <= 'z' 
            || c >= '0' && c <= '9'
        );
    }
}
