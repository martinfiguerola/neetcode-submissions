class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        // ["act", "cat", "hat"] | map = {} 

        Map<String, List<String>> map = new HashMap<>();


        for (String str : strs) { // "act"

            char[] array = str.toCharArray(); // ['c','a','t']
            Arrays.sort(array); // ['a','c','t']
            String sortedWord = new String(array);// "act"

            if (!map.containsKey(sortedWord)){
                map.put(sortedWord, new ArrayList<>()); // map = {"act":[ ],}
            }
            map.get(sortedWord).add(str); // map = { act:[act, cat]}
        }

        return new ArrayList<>(map.values()); 
    }
}


