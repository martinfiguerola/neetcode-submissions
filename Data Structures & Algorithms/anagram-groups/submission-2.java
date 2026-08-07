class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) { // "act"

            char[] characters = str.toCharArray();
        
            Arrays.sort(characters);
        
            String sorted = new String(characters);

            if (!map.containsKey(sorted)){ 
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(str);
        }

        return new ArrayList<>(map.values());
    }
}
