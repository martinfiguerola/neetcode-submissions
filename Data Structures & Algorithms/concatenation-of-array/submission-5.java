class Solution {
    public int[] getConcatenation(int[] nums) { 

        // [1, 4]   
        //  0  1  2
        int[] ans = new int[nums.length*2]; // 2 * 2 = 4
        // [1, 4, 1, 4]
        //  0  1  2  3  4

        for (int i = 0; i < ans.length; i++) { // i = 3 < 4

            if (i < nums.length) { // 3 < 2
                ans[i] = nums[i]; // ans[1] = nums[1]
            }else{
                ans[i] = nums[i - nums.length];
                // ans[3] = nums[3 - 2] -> ans[3] = nums[1]
            }
        }

        return ans;
    }


}