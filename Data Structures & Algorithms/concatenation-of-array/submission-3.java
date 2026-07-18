class Solution {
    public int[] getConcatenation(int[] nums) {
        
    // 1 Create empty integer array ans with lenght of nums.leng * 2

    int[] ans = new int[nums.length * 2];

    // 2 PARA cada 'i' desde 0 hasta len(ans) - 1:
    for (int i = 0; i < ans.length; i++) {
        // SI i > nums.leng - 1
        // ans[i] = nums[i - nums.leng]
        if (i > nums.length - 1) ans[i] = nums[i - nums.length];
        // SINO  ans[i] = nums[i]
        else ans[i] = nums[i];

    }   
    // 3 RETURN ans
    return ans;

    }

    // for (int i = 0; i < nums.length; i++) {
    //ans[i] = nums[i];                // Primera mitad
    //ans[i + nums.length] = nums[i];  // Segunda mitad
    //}
}