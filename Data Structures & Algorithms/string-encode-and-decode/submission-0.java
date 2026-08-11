class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for(String str : strs) {
            int length = str.length();
            sb.append(length).append('#').append(str);
        }

        return sb.toString();

    }

    public List<String> decode(String str) {
        // Carácter:  4 # h o l a 3 # s o  l
        // Posición:  0 1 2 3 4 5 6 7 8 9 10

        List<String> result = new ArrayList<>();
        int i = 0;

        while(i < str.length()) {

            int j = i;

            while(str.charAt(j) != '#') {
                j++;
            }

            int length = Integer.parseInt(str.substring(i, j)); 

            int start = j + 1;
            int end = start + length;

            String word = str.substring(start, end);

            result.add(word);

            i = end;
        }

        return result;
    }
}
