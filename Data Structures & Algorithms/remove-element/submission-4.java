class Solution {
    public int removeElement(int[] nums, int val) {
        
        int k = 0; // k = 0
        // [3, 2, 2, 3]

        for (int i = 0; i < nums.length; i++) { // i = 1  | nums[1] = 2

            if (nums[i] != val){ // 2 != 3
                
                nums[k] = nums[i]; // nums[0] = num[1] | 3 = 2

                k++; // k = 0;
            }
        }

        return k; // 2
    }
}