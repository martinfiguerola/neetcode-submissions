class Solution {
    public int majorityElement(int[] nums) {
        
        HashMap<Integer, Integer> map = new HashMap<>();

        int limit = nums.length / 2;

        for (int n : nums) {
            int count = map.getOrDefault(n, 0) + 1;

            map.put(n, count);

            if (count > limit) return n;
        }
        return -1;
    }
}