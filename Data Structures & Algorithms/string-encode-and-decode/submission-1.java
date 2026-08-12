class Solution {

    public String encode(List<String> strs) {
        // ["hola", "co"] --> "4#hola2#co"

        StringBuilder sb = new StringBuilder();
    
        for (String str : strs) {
            sb.append(str.length()).append("#").append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {

        //  4 # h o l a 2 # c o leng"
        //  0 1 2 3 4 5 6 7 8 9  10
        //    j
        //              i
        
        List<String> result = new ArrayList<>();
        int i = 0;

        while(i < str.length()) {
            
            int j = i;

            while(str.charAt(j) != '#'){
                j++;
            }

            int length = Integer.parseInt(str.substring(i, j));// 4

            int start = j + 1; // 2 - 'h'
            int end = start + length; // 2 + 4 = 6

            String word = str.substring(start, end); // "hola"

            result.add(word); // ["hola", ..]
            
            i = end; // 6 - '2'
        }
        return result;
    }
}
