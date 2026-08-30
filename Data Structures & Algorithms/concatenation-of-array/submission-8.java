class Solution {
    public int[] getConcatenation(int[] nums) {

        int[] ans = new int[nums.length * 2];

        for (int i = 0; i < ans.length; i++) {

            ans[i] = (i > nums.length - 1) ? 
            nums[i - nums.length] : 
            nums[i];
        }

        return ans;

    }
}