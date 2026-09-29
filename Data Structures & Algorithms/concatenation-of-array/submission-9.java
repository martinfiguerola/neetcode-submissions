class Solution {
    public int[] getConcatenation(int[] nums) {
        
        /*
            nums = [1,2,3] n = 4
            i       0 1 2  
        
            ans = [_,_,_,_,_,_,_,_] 8 = 2n
            i.  =. 0 1 2 3 4 5 6 7
        */

        int[] ans = new int[nums.length * 2];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[i + nums.length] = nums[i];
        }

        return ans;

    }

    // Provo con [1,2] e n = 2
    // Primo paso i = 0 e copio 1 in ans[0] e anche in ans[2] poi nel ulitmo passo i = 1 quindi copio 2 in ans[1] e anche in ans[3] che e la ultima posizione di un array di lungeza 
}