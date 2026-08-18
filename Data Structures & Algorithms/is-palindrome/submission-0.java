class Solution {
    public boolean isPalindrome(String s) {

        int l = 0, r = s.length() - 1;

        while (l < r) {
            // avanzar puntero l si no es alfanumerico
            while (l < r && !alphaNum(s.charAt(l))) {
                l++;
            }

            while(r > l && !alphaNum(s.charAt(r)) ){
                r--;
            }

            if(Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))){
                return false;
            } 
            l++;
            r--;
        }
        return true;
        
    }

    // Función auxiliar para verificar si un carácter es alfanumérico (ASCII)
    public boolean alphaNum (char c) {
        return (
            c >= 'A' && c <= 'Z' ||
            c >= 'a' && c <= 'z' ||
            c >= '0' && c <= '9' 
        );
    }
}
