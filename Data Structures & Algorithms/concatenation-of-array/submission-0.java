class Solution {
    public int[] getConcatenation(int[] nums) {
        
        int[] ans = new int[nums.length * 2 ];


        for (int i = 0; i < ans.length; i++) {
            
            if ( i > nums.length - 1 ) {
                ans[i] = nums[i - nums.length]; // i - 3
            }else {
                ans[i] = nums[i];   
            }
        }

        return ans;
    }
    
}