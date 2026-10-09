class Solution {
    public int[] getConcatenation(int[] nums) {
        
        int n = nums.length;

        int[] ans = new int[n * 2];

        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }

        return ans;
    }

    /*
     nums = [1,4,1], n = 3. 
     Primo passo: copio 1 in ans[0] e in ans[0 + 3]. -> [1, 0, 0, 1, 0 , 0] 
     Secondo passo: i = 1, copio 4 in ans[1] e in ans[1+3] = [1,4,_,1,4,_]       
     Terzo passo: i = 2, copio 1 in ans[2] e in ans[2+3] = [1,4,2,1,4,2]
     Questa è l'ultima posizione, quindi non esco dai limiti.
     Il risultato è corretto. 
     Il tempo è O grande di enne, perché scorro nums una sola volta. 
     Lo spazio extra è O grande di uno: oltre al risultato richiesto non uso niente."
    */
}

