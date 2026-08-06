class Solution {
    public int removeElement(int[] nums, int val) {

        int k = 0;
        // k = 2 / i = 4 / 4 < 4
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != val){ // 3 != 3
                nums[k] = nums[i]; // 2 = 2
                k++; // k + 1
            } 
        }

        return k; // 2 
    }
}