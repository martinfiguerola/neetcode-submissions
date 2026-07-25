class Solution {
    public int[] twoSum(int[] nums, int target) {


        Map<Integer, Integer> map = new HashMap<>();

        // [4,5,6] /  10  /  [{4, 0}, {6, 1}, {}]
        //  0 1 2 
        //      i 

        for (int i = 0; i < nums.length; i++) {
            int key = target - nums[i]; // 10 - 6  = 4
            if (map.containsKey(key)) return new int[]{map.get(key), i}; // {0, 2 }
            else map.put(nums[i], i); // {6, 1}
        }
        
        return new int[]{};
    }
}
