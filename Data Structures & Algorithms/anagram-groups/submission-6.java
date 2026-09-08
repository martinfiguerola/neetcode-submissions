class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {

            char[] character = s.toCharArray();

            Arrays.sort(character);

            String sorted = new String(character);

            
            map.putIfAbsent(sorted, new ArrayList<>());
            
            map.get(sorted).add(s);
        }

        return new ArrayList<>(map.values());
    }
}
