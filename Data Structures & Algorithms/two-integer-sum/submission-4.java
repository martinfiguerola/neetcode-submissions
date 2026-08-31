class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer, Integer> map = new HashMap<>();
        // [3, 4, 5, 6] | 7  |  [{3:0 }, {}]

        for (int i = 0; i < nums.length; i++) { // i = 1 | nums[i] = 4

            int temp = target - nums[i]; // 7 - 4 = 3

            if (map.containsKey(temp)){
                return new int[]{map.get(temp), i};
            }  // [1,0 ]

            map.put(nums[i], i); // 3, 0
        }
        return new int[]{};
    }
}
