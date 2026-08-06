class Solution {
    public int majorityElement(int[] nums) {
        
        // [ 3, 2, 3]

        int limit = nums.length / 2; // limit = 1

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {

            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.get(num) > limit) return num;
        }

        return -1;
    }
}