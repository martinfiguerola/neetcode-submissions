class Solution {
    public boolean hasDuplicate(int[] nums) {
        /*  

            set = {3}
            nums = [3,1,3]
                        ^
            3 gia che in set? no,quindi lo agregamos
            1 gia che in set? no,quindi lo agregamos
            3 gia che in set? se, allora e restituimo true;
            se abbiamo fino di scorre il array restituiamo false, perche no si tovo un elemento che haya aparecido due volte
         
        */

        Set<Integer> set = new HashSet<>();
        
        for (int e : nums){
            if (set.contains(e)) return true;
            else set.add(e);
        }
        return false;
    }
}